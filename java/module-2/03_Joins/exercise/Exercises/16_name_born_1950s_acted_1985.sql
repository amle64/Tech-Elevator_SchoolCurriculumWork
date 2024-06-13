-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985.
-- Order the results by actor from oldest to youngest.
-- (20 rows)

SELECT DISTINCT person_name, birthday
FROM person p
JOIN movie_actor ma ON ma.actor_id = p.person_id
JOIN movie m ON m.movie_id = ma.movie_id
WHERE birthday >= '1950-01-01' AND birthday <= '1959-12-31' AND m.release_date >= '1985-01-01' AND m.release_date <= '1985-12-31'
ORDER BY birthday ASC;