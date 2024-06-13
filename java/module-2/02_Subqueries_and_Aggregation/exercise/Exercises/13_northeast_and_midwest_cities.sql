-- 13. The city name, state abbreviation, and population for all cities in the Northeast and Midwest census regions.
-- Order the results by state abbreviation first (alphabetical), then by population (largest first).
-- (84 rows)

SELECT 
    c.city_name, 
    c.state_abbreviation, 
    c.population
FROM 
    City c
JOIN 
    State s ON c.state_abbreviation = s.state_abbreviation
WHERE 
    s.census_region IN ('Northeast', 'Midwest')
ORDER BY 
    c.state_abbreviation ASC, 
    c.population DESC;