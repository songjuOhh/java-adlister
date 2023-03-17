
CREATE DATABASE IF NOT EXISTS adlister_db;


USE adlister_db;



DROP TABLE IF EXISTS users;

CREATE TABLE users (
                      id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                      username VARCHAR(50) ,
                      email VARCHAR(80),
                      password VARCHAR(80) ,
                      PRIMARY KEY (id)
);


DROP TABLE IF EXISTS ads;

CREATE TABLE ads (
                    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                    user_id INT UNSIGNED NOT NULL ,
                    title VARCHAR(50),
                    description VARCHAR(128) ,
                    PRIMARY KEY (id),
                    FOREIGN KEY (user_id) REFERENCES users(id)
);




