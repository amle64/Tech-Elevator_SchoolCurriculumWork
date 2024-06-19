
ROLLBACK;

START TRANSACTION;

ALTER SEQUENCE member_id_seq NO CYCLE;


	INSERT INTO members (last_name,
							first_name, 
							email_address,
							phone_number,
							date_of_birth,
							reminder_flag)
	VALUES ('Nguyen','Bob','boble64@gmail.com','214-660-4532','11/22/1989', 'TRUE'),
	 ('Tran','Jessica','jtran64@gmail.com','214-600-4532','11/25/1989', 'TRUE'),
	 ('Tram','James','jtr65@gmail.com','214-688-4532','11/27/1989', 'TRUE'),
	 ('Huynh','Chris','chu64@gmail.com','214-678-4532','11/30/1989', 'FALSE'),
	 ('Le','Phillip','ple64@gmail.com','214-609-1532','11/19/1989', 'FALSE'),
	 ('Lee','Tom','tlee64@gmail.com','214-590-4782','10/19/1989', 'FALSE'),
	 ('Liam','Sarah','sliam64@gmail.com','214-349-9832','09/19/1989', 'FALSE'),
	 ('Sopoco','Lily','lsopoc64@gmail.com','214-239-7632','08/19/1989', 'TRUE');

	 INSERT INTO interestGroup (group_name,
							member_count) 

	VALUES ('GAMERS', 5),
	 ('MOVIE-GOERS', 3),
	 ('SPORTS', 2);
 
 INSERT INTO groupMembers (group_id, member_id)
 VALUES (1,1),
 		(1,2),
 		(1,3),
 		(1,4),
		(1,5),
		(2,6),
		(2,7),
		(3,8),
		(3,1);

 INSERT INTO eventList (event_name,
						description,
						start_date_time,
						duration,
						event_group_id,
						members_attended)
	
VALUES ('Gachas','A place to lose all of your money','2024-06-18 17:30:00','120',1, 1),
 ('Marvel','A place to watch all of the MCU films','2024-06-10 17:30:00','4116',2,2),
 ('Tennis','A place to see people hit balls','2024-06-11 17:30:00','180',3, 2),
 ('Volleyball','A place to see people hit bigger balls','2024-06-12 17:30:00','150',3,2);

INSERT INTO eventMembers (event_id, member_id)

VALUES (1,1),
	   (2,6),
	   (2,2),
	   (3,8),
	   (3,1),
	   (4,8),
	   (4,3);

COMMIT;