-- 9. The titles of movies directed by James Cameron, sorted alphabetically.
-- (6 rows)

-- SELECT person_id
-- FROM person
-- WHERE person_name = 'James Cameron';
-- id = 2710

SELECT title
FROM movie
WHERE director_id = '2710'
ORDER BY title;