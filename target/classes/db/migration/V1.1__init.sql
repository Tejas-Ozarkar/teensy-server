
CREATE TABLE IF NOT EXISTS user(
    id int AUTO_INCREMENT,
    firstName varchar(255),
    lastName varchar(255),
    username varchar(255),
    email varchar(255),
    password varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS url(
    id int AUTO_INCREMENT,
    shortUrl varchar(255),
    longUrl varchar(255),
    userid int,
    PRIMARY KEY(id),
    FOREIGN KEY (userid) REFERENCES user(id)
);

CREATE TABLE IF NOT EXISTS card(
    id int AUTO_INCREMENT,
    title varchar(255),
    description varchar(255),
    icon varchar(255),
    urlId int,
    PRIMARY KEY (id),
    FOREIGN KEY (urlId) REFERENCES url(id)
);

CREATE TABLE IF NOT EXISTS tribe(
    id int AUTO_INCREMENT,
    title varchar(255),
    description varchar(255),
    userId int,
    PRIMARY KEY (id),
    FOREIGN KEY (userId) REFERENCES user(id)
);

CREATE TABLE IF NOT EXISTS tribe_admin(
    id int AUTO_INCREMENT,
    userId int,
    groupId int,
    PRIMARY KEY (id),
    FOREIGN KEY (userId) REFERENCES user(id),
    FOREIGN KEY (groupId) REFERENCES tribe(id)
);