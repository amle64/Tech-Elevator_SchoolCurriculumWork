ROLLBACK;
START TRANSACTION;

DROP TABLE IF EXISTS customers, artists, artwork, customer_purchases CASCADE;



CREATE TABLE customers
(
	customerId serial,
	name varchar(64) not null,
	address varchar (100) not null,
	phone varchar(11) null,
	
	CONSTRAINT pk_customers PRIMARY KEY (customerID)


);

CREATE TABLE artists
(
	artistID serial,
	firstName varchar(64) not null,
	lastName varchar(64) not null,
	
	CONSTRAINT pk_artists PRIMARY KEY (artistId)
	
);

CREATE TABLE artwork

(
	artCode serial,
	title varchar(100) not null,
	artistId int NOT null,
	
	CONSTRAINT pk_artwork PRIMARY KEY (artCode),
	CONSTRAINT fk_artist FOREIGN KEY (artistId) REFERENCES artists (artistId)
	
);

CREATE TABLE customer_purchases
(
	customerId int not null,
	artCode int not null,
	purchaseDate timestamp not null,
	priceMoney DECIMAL(10,2) not null,
	
	CONSTRAINT pk_purchaseDate PRIMARY KEY (purchaseDate),
	CONSTRAINT fk_artwork FOREIGN KEY (artCode) REFERENCES artwork (artCode),
	CONSTRAINT fk_customers FOREIGN KEY (customerId) REFERENCES customers (customerId)
);

COMMIT TRANSACTION;