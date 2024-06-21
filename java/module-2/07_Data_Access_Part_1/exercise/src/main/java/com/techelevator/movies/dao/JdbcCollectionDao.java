package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcCollectionDao implements CollectionDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcCollectionDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Collection> getCollections() {

        String sql = "SELECT * FROM collection";

        return jdbcTemplate.query(sql, new RowMapper<Collection>() {
            @Override
            public Collection mapRow(ResultSet rs, int i) throws SQLException {
                Collection collection = new Collection ();
                collection.setId(rs.getInt("collection_id"));
                collection.setName(rs.getString("collection_name"));
                return collection;
            }
        });
    }

    @Override
    public Collection getCollectionById(int id) {
        try{
            String sql = "SELECT * FROM collection WHERE collection_id = ?";
            return jdbcTemplate.queryForObject(sql, new RowMapper<Collection>() {
                @Override
                public Collection mapRow(ResultSet rs, int i) throws SQLException {
                    Collection collection = new Collection ();
                    collection.setId(rs.getInt("collection_id"));
                    collection.setName(rs.getString("collection_name"));
                    return collection;
                }
            },id);

        } catch (EmptyResultDataAccessException e){
            return null;
        }



    }


    @Override
    public List<Collection> getCollectionsByName(String name, boolean useWildCard) {
        String sql;
        List <Collection> collections = new ArrayList<>();
        if(useWildCard){
            sql = "SELECT * FROM collection WHERE collection_name ILIKE ?;";
            name = "%"+name+"%";
            }
        else {
            sql = "SELECT * FROM collection WHERE collection_name ILIKE ?";
            }
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql,name);
        while(results.next()){
            Collection collection = mapRowToCollection(results);
            collections.add(collection);
        }
        return collections;
    }


    private Collection mapRowToCollection (SqlRowSet results){
        Collection collection = new Collection();
        collection.setName(results.getString("collection_name"));
        collection.setId(results.getInt("collection_id"));
        return collection;
    }
}
