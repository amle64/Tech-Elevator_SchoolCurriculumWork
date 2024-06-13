-- 7. The genres of movies that Christopher Lloyd has appeared in, sorted alphabetically.
-- (8 rows) Hint: DISTINCT will prevent duplicate values in your query results.

-- SELECT person_id
-- FROM person
-- WHERE person_name = 'Christopher Lloyd';
--1062 is actor_id

SELECT DISTINCT genre_name
FROM genre g
JOIN movie_genre mg ON g.genre_id = mg.genre_id
JOIN movie m ON m.movie_id = mg.movie_id
JOIN movie_actor ma ON m.movie_id = ma.movie_id
WHERE actor_id = 1062
ORDER BY genre_name;