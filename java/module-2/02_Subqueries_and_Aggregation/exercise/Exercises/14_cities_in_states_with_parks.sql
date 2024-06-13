-- 14. The city name and state abbreviation for all states with a national park.
-- Order the results by state abbreviation, then city name, both in alphabetical order.
-- (261 rows)

SELECT c.city_name, c.state_abbreviation
FROM city c
WHERE c.state_abbreviation IN (
	SELECT ps.state_abbreviation
	FROM park_state ps)
	
ORDER BY c.state_abbreviation, c.city_name
LIMIT 261;