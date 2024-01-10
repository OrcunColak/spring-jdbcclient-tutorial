DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  id INT NOT NULL,
  name VARCHAR(255) NOT NULL,
  lastname VARCHAR(255) NOT NULL,
  birthday DATE NOT NULL,
  PRIMARY KEY (id)
);