CREATE TABLE albums (
                        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                        artist VARCHAR(128) ,
                        name VARCHAR(128),
#                         release_date SMALLINT UNSIGNED,
                        genre VARCHAR(128) ,
#                         sales FLOAT,
                        PRIMARY KEY (id)
#                         UNIQUE album_title (name, artist)
);