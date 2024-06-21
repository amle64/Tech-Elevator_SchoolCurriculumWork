package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import com.techelevator.movies.model.Genre;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.List;

public class JdbcGenreDao implements GenreDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcGenreDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Genre> getGenres() {
        String sql = "SELECT * FROM genre;";
        List<Genre> genres = new ArrayList<>();
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
        while (result.next()){
            Genre genre = new Genre();
            genre = mapRowToGenre(result);
            genres.add(genre);
        }
        return genres;
    }

    @Override
    public Genre getGenreById(int id) {

        Genre genre = new Genre();
        genre = null;

            String sql = "SELECT * FROM genre WHERE genre_id = ?";

            SqlRowSet result = jdbcTemplate.queryForRowSet(sql,id);
            if (result.next()){
                genre = mapRowToGenre(result);
            }
            return genre;

    }

    @Override
    public List<Genre> getGenresByName(String name, boolean useWildCard) {
        String sql = "SELECT * FROM genre WHERE genre_name ILIKE ?";;
        if(useWildCard){
            name = "%"+name+"%";
        }
        List <Genre> genres = new ArrayList<>();

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql,name);

        while (result.next()){
            Genre genre = new Genre();
            genre = mapRowToGenre(result);
            genres.add(genre);
        }
        return genres;
    }

    private Genre mapRowToGenre (SqlRowSet results){
        Genre genre = new Genre();
        genre.setId(results.getInt("genre_id"));
        genre.setName(results.getString("genre_name"));
        return genre;

    }


}
