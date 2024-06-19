ROLLBACK;

START TRANSACTION;
DROP TABLE IF EXISTS members, interestGroup, eventList, groupMembers, eventMembers;
DROP SEQUENCE IF EXISTS member_id_seq, event_number_seq;

CREATE SEQUENCE member_id_seq;

CREATE TABLE members
(
	member_id int PRIMARY KEY DEFAULT nextval('member_id_seq'),
	last_name varchar(64) not null,
	first_name varchar(64) not null,
	email_address varchar(80) not null,
	phone_number varchar(12),
	date_of_birth DATE not null,
	reminder_flag boolean not null
	
);

CREATE TABLE interestGroup
(
	group_id serial,
	group_name varchar(64) UNIQUE,
	member_count int not null,
	
	CONSTRAINT pk_groupNumber PRIMARY KEY (group_id)
);

CREATE TABLE groupMembers
(
	group_id int not null,
	member_id int not null,
	
	PRIMARY KEY (member_id, group_id),
	CONSTRAINT fk_groupid FOREIGN KEY (group_id) REFERENCES interestGroup (group_id),
	CONSTRAINT fk_memberid FOREIGN KEY (member_id) REFERENCES members (member_id)
);

CREATE SEQUENCE event_number_seq;

CREATE TABLE eventList
(
	event_id int PRIMARY KEY DEFAULT nextval('event_number_seq'),
	event_name varchar(64) not null,
	description varchar(200) not null,
	start_date_time TIMESTAMP not null,
	duration int not null,
	event_group_id int not null,
	members_attended int not null,
	
	CONSTRAINT fk_eventGroup FOREIGN KEY (event_group_id) REFERENCES interestGroup (group_id)
);

CREATE TABLE eventMembers
(
	event_id int not null,
	member_id int not null,
	
	PRIMARY KEY (event_id, member_id),
	CONSTRAINT fk_eventid FOREIGN KEY (event_id) REFERENCES eventList (event_id),
	CONSTRAINT fk_memberid FOREIGN KEY (member_id) REFERENCES members (member_id)
);

--testingDatabase file is the file with all of the testable data
COMMIT;