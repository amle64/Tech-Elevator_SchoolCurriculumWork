-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.

SELECT (city_name || ' (' ||state_abbreviation|| ')') AS city_state_abbreviation
FROM city
ORDER BY city_name;
-- The all parks by name and date established.
SELECT ('Name: ' || park_name || ' - Date Established: ' || date_established ) AS park_state_established
FROM park;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.

SELECT city_name
FROM city
WHERE city_name ILIKE '% %';

-- SUBQUERIES

-- List all cities in the western census region
SELECT city_name, state_abbreviation
FROM city
WHERE state_abbreviation IN
	(SELECT state_abbreviation
	FROM state
	WHERE census_region = 'West');

-- List all cities in states with "garden" in their nickname
SELECT city_name
FROM city
WHERE state_abbreviation IN(
	SELECT state_abbreviation
	FROM state
	WHERE state_nickname ILIKE '%garden%')
ORDER BY state_abbreviation;

-- Get the parks with the smallest and largest areas

-- SELECT MIN(area) FROM park
-- SELECT MAX(area) FROM park
SELECT park_name, area
FROM park
WHERE area = (SELECT MIN(area) FROM park) OR
	  area = (SELECT MAX(area) FROM park);

-- Get the state name and census region for all states with a national park
SELECT state_name, census_region
FROM state
WHERE state_abbreviation IN (SELECT state_abbreviation FROM park_state)
ORDER BY census_region;

-- Subqueries aren't limited to WHERE clauses, can appear in SELECT list (must return only 1 result)
-- Include state name rather than the state abbreviation while counting the number of cities in each state,
--   ordered from most cities to least.



-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population) AS avg_state_population
FROM state;

-- Total population in the West and South census regions

SELECT SUM(population) AS sum_state_population
FROM state;
-- The number of cities with populations greater than 1 million

SELECT COUNT(population) AS population_greater_than_1_million
FROM city
WHERE population > 1000000;
-- The number of state nicknames.
SELECT COUNT(state_nickname) AS number_of_nicknames
FROM state;

-- The area of the smallest and largest parks.
SELECT min(area) as smallest_park, max(area) as largest_park
FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT state_abbreviation, COUNT(city_name) AS city_count
FROM city
GROUP BY state_abbreviation
ORDER BY COUNT(city_name) DESC;

-- Determine the average park area depending upon whether parks allow camping or not.
SELECT AVG(area) AS AVG_area_of_park, has_camping
FROM park
GROUP BY has_camping;

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT state_abbreviation, SUM(population) AS population_of_state
FROM city
GROUP BY state_abbreviation
ORDER BY state_abbreviation;

-- The smallest city population in each state ordered by city population.
SELECT state_abbreviation, MIN(population) as smallest_city_pop
FROM city
GROUP BY state_abbreviation
ORDER BY smallest_city_pop;
