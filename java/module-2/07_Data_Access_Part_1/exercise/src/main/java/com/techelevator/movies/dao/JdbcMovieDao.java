package com.techelevator.movies.dao;

import com.techelevator.movies.model.Genre;
import com.techelevator.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JdbcMovieDao implements MovieDao {

    private final JdbcTemplate jdbcTemplate;

    //private final String MOVIE_SELECT = "SELECT m.* FROM...

    public JdbcMovieDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Movie> getMovies() {
        String sql = "SELECT * FROM movie";
        List<Movie> movies = new ArrayList<>();
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
        while (result.next()){
            Movie movie = new Movie();
            movie = mapRowToMovie(result);
            movies.add(movie);
        }
        return movies;

    }

    @Override
    public Movie getMovieById(int id) {
        Movie movie = null;
        String sql = "SELECT * FROM movie WHERE movie_id = ?;";


        SqlRowSet result = jdbcTemplate.queryForRowSet(sql,id);
        if (result.next()){
            movie = mapRowToMovie(result);
        }
        return movie;
    }

    @Override
    public List<Movie> getMoviesByTitle(String title, boolean useWildCard) {
        String sql = "SELECT * FROM movie WHERE title ILIKE ?";;
        if(useWildCard){
            title = "%"+title+"%";
        }
        List <Movie> movies = new ArrayList<>();

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql,title);

        while (result.next()){
            Movie movie = new Movie();
            movie = mapRowToMovie(result);
            movies.add(movie);
        }
        return movies;

    }
    /**
     * Get a list of all the movies directed by a given director (case-insensitive) and released
     * between a range of years (inclusive) from the datastore. The movies are sorted from
     * oldest to newest. Return an empty list when no matching collections are found.
     *
     * @param directorName the name of the director
     * @param startYear the starting release year of the range of years
     * @param endYear the ending release year of the range of years
     * @param useWildCard wraps directorName with wild card characters if true
     * @return all matching movies as a list of Movie objects
     */
    @Override
    public List<Movie> getMoviesByDirectorNameAndBetweenYears(String directorName, int startYear,
                                                              int endYear, boolean useWildCard) {
        String sql = "SELECT * FROM movie WHERE director_id IN (SELECT person_id FROM person WHERE person_name ILIKE ?)";
        sql += "AND release_date BETWEEN ? AND ?;";

        if (useWildCard){
            directorName = "%"+directorName+"%";
        }

        List <Movie> movies = new ArrayList<>();

        LocalDate startDate = LocalDate.of(startYear,1,1);
        LocalDate endDate = LocalDate.of(endYear,12,31);
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql,directorName,startDate,endDate);

        while (result.next()){
            Movie movie = new Movie();
            movie = mapRowToMovie(result);
            movies.add(movie);
        }
        return movies;

    }

    private Movie mapRowToMovie(SqlRowSet results){
        Movie movie = new Movie();
        movie.setId(results.getInt("movie_id"));
        movie.setTitle(results.getString("title"));
        movie.setOverview(results.getString("overview"));
        movie.setTagline(results.getString("tagline"));
        movie.setDirectorId(results.getInt("director_id"));
        movie.setReleaseDate(Objects.requireNonNull(results.getDate("release_date")).toLocalDate());
        movie.setHomePage(results.getString("home_page"));
        movie.setLengthMinutes(results.getInt("length_minutes"));
        movie.setCollectionId(results.getInt("collection_id"));
        movie.setPosterPath(results.getString("poster_path"));
        return movie;
    }
}
/*private int id;
private String title;
private String overview;
private String tagline;
private String posterPath;
private String homePage;
private LocalDate releaseDate;
private int lengthMinutes;
private int directorId;
private int collectionId;*/
