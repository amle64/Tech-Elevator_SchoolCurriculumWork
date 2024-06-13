-- 20. The titles, lengths, and release dates of the 5 longest movies in the "Action" genre.
-- Order the movies by length (highest first), then by release date (latest first).
-- (5 rows, expected lengths around 180 - 200)

-- SELECT genre_id
-- FROM genre
-- WHERE genre_name LIKE 'Action'
-- 28

SELECT title, length_minutes, release_date
FROM movie m
WHERE m.movie_id IN (SELECT movie_id FROM movie_genre WHERE genre_id = 28)
ORDER BY length_minutes DESC, release_date DESC
LIMIT 5;