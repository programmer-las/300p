
CREATE TABLE users (
    id serial  NOT NULL,
    name varchar(255)  NOT NULL,
    age int  NOT NULL,
    login varchar(255)  NOT NULL,
    password varchar(255)  NOT NULL,
    CONSTRAINT users_pk PRIMARY KEY (id)
);

