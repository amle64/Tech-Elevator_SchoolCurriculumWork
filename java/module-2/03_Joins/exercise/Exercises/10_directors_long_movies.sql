-- 10. The names of directors who have directed a movie over 3 hours [180 minutes], sorted alphabetically.
-- (15 rows)

SELECT person_name
FROM person	
WHERE person_id IN (SELECT director_id FROM movie m WHERE length_minutes > 180)
ORDER BY person_name;