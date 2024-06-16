-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)

-- SELECT movie_id
-- FROM movie
-- WHERE title = 'Back to the Future'
-- 105

ROLLBACK;
START TRANSACTION; 
INSERT INTO movie_actor (movie_id, actor_id)
VALUES (105, 7036);
COMMIT;


-- SELECT person_id
-- FROM person
-- WHERE person_name = 'Eric Stoltz';