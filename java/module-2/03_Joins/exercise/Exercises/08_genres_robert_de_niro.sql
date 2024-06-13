-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later, sorted alphabetically.
-- (6 rows)

-- SELECT person_id
-- FROM person
-- WHERE person_name = 'Robert De Niro';
-- person_id = 380

SELECT DISTINCT genre_name
FROM genre g
JOIN movie_genre mg ON g.genre_id = mg.genre_id
JOIN movie m ON m.movie_id = mg.movie_id
JOIN movie_actor ma ON m.movie_id = ma.movie_id
WHERE actor_id = 380 AND release_date >= '2010-01-01'
ORDER BY genre_name;