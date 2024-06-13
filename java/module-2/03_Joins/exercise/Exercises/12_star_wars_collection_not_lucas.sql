-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas, sorted alphabetically.
-- (5 rows)

-- SELECT person_id
-- FROM person
-- WHERE person_name = 'George Lucas'; id = 1

SELECT title
FROM movie
WHERE collection_id = 10 AND director_id != 1
ORDER BY title;
