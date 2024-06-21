package com.techelevator.movies.dao;

import com.techelevator.movies.model.Movie;
import com.techelevator.movies.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JdbcPersonDao implements PersonDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcPersonDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Person> getPersons() {
        String sql = "SELECT * FROM person";
        List<Person> people = new ArrayList<>();
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);

        while(result.next()){
            Person person = new Person();
            person = mapRowToPerson(result);
            people.add(person);
        }
        return people;
    }

    @Override
    public Person getPersonById(int id) {
        String sql = "SELECT * FROM person WHERE person_id = ?";
        Person person = null;

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql,id);
        if (result.next()){
            person = mapRowToPerson(result);
        }
        return person;
    }

    @Override
    public List<Person> getPersonsByName(String name, boolean useWildCard) {
        String sql = "SELECT * FROM person WHERE person_name ILIKE ?";;
        if(useWildCard){
            name = "%"+name+"%";
        }
        List <Person> people = new ArrayList<>();

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql,name);

        while (result.next()){
            Person person = new Person();
            person = mapRowToPerson(result);
            people.add(person);
        }
        return people;

    }

    @Override
    public List<Person> getPersonsByCollectionName(String collectionName, boolean useWildCard) {

        return null;
    }
    private Person mapRowToPerson(SqlRowSet results){
        Person person = new Person();
        person.setId(results.getInt("person_id"));
        person.setName(results.getString("person_name"));
        person.setBirthday(Objects.requireNonNull(results.getDate("birthday")).toLocalDate());
        person.setDeathDate(Objects.requireNonNull(results.getDate("deathday")).toLocalDate());
        person.setBiography(results.getString("biography"));
        person.setProfilePath(results.getString("profile_path"));
        person.setHomePage(results.getString("home_page"));

        return person;
    }
}
/*
private int id;
private String name;
private LocalDate birthday;
private LocalDate deathDate;
private String biography;
private String profilePath;
private String homePage;*/
