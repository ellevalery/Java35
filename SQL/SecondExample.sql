CREATE TABLE users (
	userID int PRIMARY KEY NOT NULL auto_increment,
    username varchar(45) NOT NULL,
    password varchar(45) NOT NULL,
    fullName varchar(100) NOT NULL,
    email varchar(45)
);

INSERT INTO users (username, password, fullname, email)
VALUES ('truewall', 'mexico', 'Donald Trump', 'maga@gmail.com');

insert INTO users (username, password, fullname)
values ('joeRogan', '12345678', 'Joe Rogan');

INSERT INTO users (username, password, email)
VALUES ('Obama333', '123', 'obama@gmail.com');

INSERT INTO users (username, password, email, fullname)
VALUES ('Obama333', '123', 'obama@gmail.com', 'Barack Obama');

SELECT * FROM users;