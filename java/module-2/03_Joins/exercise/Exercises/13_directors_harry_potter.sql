-- 13. The directors of the movies in the "Harry Potter Collection", sorted alphabetically.
-- (4 rows)

-- SELECT collection_id
-- FROM collection
-- WHERE collection_name LIKE 'Harry %';

-- collection_id = 1241

SELECT person_name
FROM person
WHERE person_id IN (SELECT director_id FROM movie WHERE collection_id = 1241)
ORDER BY person_name;

