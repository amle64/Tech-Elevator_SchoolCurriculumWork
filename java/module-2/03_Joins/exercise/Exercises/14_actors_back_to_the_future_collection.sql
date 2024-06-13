-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection", sorted alphabetically.
-- (28 rows)

-- SELECT collection_id
-- FROM collection
-- WHERE collection_name LIKE 'Back to the Future %';
-- collection_id = 264

SELECT DISTINCT person_name
FROM person p
JOIN movie_actor ma ON p.person_id = ma.actor_id
WHERE ma.movie_id IN (SELECT movie_id FROM movie WHERE collection_id = 264)
ORDER BY person_name;