-- 18. The average length of movies in the "Science Fiction" genre. Name the column 'average_length'.
-- (1 row, expected result between 110-120)

-- SELECT genre_id, genre_name
-- FROM genre
-- WHERE genre_name LIKE 'Science %'
-- 878

SELECT AVG(length_minutes) AS average_length
FROM movie m
WHERE m.movie_id IN(SELECT movie_id FROM movie_genre WHERE genre_id = 878);
