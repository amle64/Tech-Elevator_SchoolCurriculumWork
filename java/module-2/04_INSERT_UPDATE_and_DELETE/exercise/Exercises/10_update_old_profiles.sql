-- 10. For all people born before 1900 whose profile_path does NOT end in ".jpg", set their
--     home_page to "No image" and their profile_path to NULL (64 rows)
-- SELECT * FROM person;
ROLLBACK;
START TRANSACTION;
UPDATE person
SET profile_path = NULL, home_page = 'No image'
WHERE person_id IN (
    SELECT person_id
    FROM person
    WHERE profile_path NOT LIKE '%.jpg' AND birthday < '1900-01-01'
    ORDER BY birthday ASC  -- or any other appropriate ordering
    LIMIT 64
);

COMMIT;
