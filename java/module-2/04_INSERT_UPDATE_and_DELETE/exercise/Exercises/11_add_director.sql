-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet. Add yourself to the person
--     table, and assign yourself as the director of "The Blob" (the movie is already in the movie table). (1 record each)
START TRANSACTION;

INSERT INTO person (person_name)
VALUES ('Andrew Le');

UPDATE movie
SET director_id = (SELECT person_id FROM person WHERE person_name = 'Andrew Le')
WHERE title = 'The Blob';

COMMIT;
