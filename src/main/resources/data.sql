DROP TABLE IF EXISTS billionaires;
 
CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO billionaires (first_name, last_name, career) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');

DROP TABLE IF EXISTS ROLE;
  
CREATE TABLE ROLE (
  ROLE_ID VARCHAR(250) NOT NULL  PRIMARY KEY,
  NAME VARCHAR(250) NOT NULL
);
 
INSERT INTO ROLE (ROLE_ID, NAME) VALUES
  ('ROLE01', 'Manager'),
  ('ROLE02', 'Operator'),
  ('ROLE03', 'Worker');
  
  