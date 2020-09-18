CREATE TABLE IF NOT EXISTS approval
(
    id          int AUTO_INCREMENT,
    title       varchar(255),
    description varchar(255),
    icon        varchar(255),
    longurl     varchar(255),
    userId      int,
    cardId      int,
    groupId     int,
    PRIMARY KEY (id),
    FOREIGN KEY (userId) REFERENCES user (id),
    FOREIGN KEY (cardId) REFERENCES card (id),
    FOREIGN KEY (groupId) REFERENCES tribe (id)
);