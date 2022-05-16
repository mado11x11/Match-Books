SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS books;
SET FOREIGN_KEY_CHECKS=1;

CREATE TABLE IF NOT EXISTS books(
id INT AUTO_INCREMENT,
name VARCHAR(20) NOT NULL,
genre VARCHAR(20) NOT NULL,
PRIMARY KEY(id)
);

INSERT INTO books (name,genre) VALUES ("test1","SF");
INSERT INTO books (name,genre) VALUES ("test2","essay");
INSERT INTO books (name,genre) VALUES ("test3","SF");
