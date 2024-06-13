-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent first.
-- (9 rows)

-- collection id = 10

SELECT title
FROM movie
WHERE collection_id = 10
ORDER BY release_date DESC;