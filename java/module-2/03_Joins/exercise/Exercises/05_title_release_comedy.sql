-- 5. The titles and release dates of all the movies that are in the Comedy genre.
-- Order the results by release date, earliest to latest.
-- (220 rows)

SELECT m.title, m.release_date
FROM movie m
JOIN movie_genre mg ON m.movie_id = mg.movie_id
WHERE mg.genre_id = 35
ORDER BY release_date
LIMIT 220;