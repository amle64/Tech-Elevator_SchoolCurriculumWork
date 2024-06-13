-- 17. The titles and taglines of movies that are in the "Family" genre that Samuel L. Jackson has acted in.
-- Order the results alphabetically by movie title.
-- (4 rows)


-- SELECT genre_id
-- FROM genre
-- WHERE genre_name LIKE 'Family';
-- 10751

-- SELECT person_id, person_name
-- FROM person
-- WHERE person_name LIKE 'Samuel %'
-- 2231

SELECT title, tagline
FROM movie m 
WHERE m.movie_id IN (SELECT movie_id FROM movie_genre WHERE genre_id = 10751 ) AND m.movie_id IN (SELECT movie_id FROM movie_actor WHERE actor_id = 2231)
ORDER BY title
LIMIT 4;