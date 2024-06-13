-- INNER JOIN
SELECT * FROM state s
INNER JOIN park_state ps
ON s.state_abbreviation = ps.state_abbreviation;

-- Write a query to retrieve the name and state abbreviation for the 2 cities named "Columbus" in the database
SELECT city_name, state_abbreviation
FROM city
WHERE city_name = 'Columbs';

-- Modify the previous query to retrieve the names of the states (rather than their abbreviations).
SELECT * FROM city;
SELECT * FROM state;

SELECT city_name, state_name
FROM city
JOIN state
ON city.state_abbreviation = state.state_abbreviation
WHERE city_name = 'Columbus';
-- Write a query to retrieve the names of all the national parks with their state abbreviations.
-- (Some parks will appear more than once in the results, because they cross state boundaries.)
SELECT * FROM park;
SELECT * FROM park_state;
SELECT park_name, state_abbreviation
FROM park p
JOIN park_state ps
ON p.park_id = ps.park_id;

-- The park_state table is an associative table that can be used to connect the park and state tables.
-- Modify the previous query to retrieve the names of the states rather than their abbreviations.
SELECT park_name, state_name
FROM park p
JOIN park_state ps
ON p.park_id = ps.park_id
JOIN state s
ON ps.state_abbreviation = s.state_abbreviation;

-- Modify the previous query to include the name of the state's capital city.


-- Modify the previous query to include the area of each park.


-- Write a query to retrieve the names and populations of all the cities in the Midwest census region.


-- Write a query to retrieve the number of cities in the city table for each state in the Midwest census region.


-- Modify the previous query to sort the results by the number of cities in descending order.


-- LEFT JOIN

-- Write a query to retrieve the state name and the earliest date a park was established in that state (or territory) for every record in the state table that has park records associated with it.


-- Modify the previous query so the results include entries for all the records in the state table, even if they have no park records associated with them.



-- MovieDB
-- After creating the MovieDB database and running the setup script, make sure it is selected in pgAdmin and confirm it is working correctly by writing queries to retrieve...

-- The names of all the movie genres


-- The titles of all the Comedy movies
