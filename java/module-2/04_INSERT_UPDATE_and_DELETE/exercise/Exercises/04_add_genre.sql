-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)
ROLLBACK;
BEGIN;

-- Step 1: Insert "Sports" genre if it doesn't exist
INSERT INTO genre (genre_name)
SELECT 'Sports'
WHERE NOT EXISTS (
    SELECT 1 FROM genre WHERE genre_name = 'Sports'
);

-- Step 2: Retrieve the genre_id for "Sports"
SELECT genre_id INTO sports_genre_id
FROM genre
WHERE genre_name = 'Sports';

-- Step 3: Insert "Coach Carter" movie if it doesn't exist
INSERT INTO movie (title)
SELECT 'Coach Carter'
WHERE NOT EXISTS (
    SELECT 1 FROM movie WHERE title = 'Coach Carter'
);

-- Step 4: Retrieve the movie_id for "Coach Carter"
SELECT movie_id INTO coach_carter_movie_id
FROM movie
WHERE title = 'Coach Carter';

-- Step 5: Insert into movie_genre to associate "Coach Carter" with "Sports" genre
INSERT INTO movie_genre (movie_id, genre_id)
VALUES ((SELECT movie_id FROM movie WHERE title = 'Coach Carter'), (SELECT genre_id FROM genre WHERE genre_name = 'Sports'));

COMMIT;
