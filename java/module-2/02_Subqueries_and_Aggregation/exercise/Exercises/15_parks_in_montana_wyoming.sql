-- 15. The park name, date established, and area for parks in Montana and Wyoming.
-- Order the results by park name alphabetically.
-- (3 rows)

SELECT p.park_name, p.date_established, p.area
FROM park p
WHERE p.park_id IN (
	SELECT ps.park_id
	FROM park_state ps
	WHERE ps.state_abbreviation IN ('MT','WY'))
ORDER BY park_name
LIMIT 3;