  
CREATE DATABASE registration;
CREATE USER 'user'@'localhost' IDENTIFIED BY 'weak';
GRANT ALL ON registration.* TO 'user'@'localhost';
FLUSH PRIVILEGES;