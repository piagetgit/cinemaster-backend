DROP TABLE if exists user_table;
CREATE TABLE user_table (
    id SERIAL,
    nome varchar(255),
    cognome varchar(255),
    password varchar(255),
    email varchar(255) PRIMARY KEY,
    data_nascita DATE,
    ruolo varchar(255),
    logged boolean
);