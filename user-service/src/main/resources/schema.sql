DROP TABLE if exists user_table;
CREATE TABLE if not exists user_table (
    id SERIAL PRIMARY KEY,
    nome varchar(255),
    cognome varchar(255),
    password varchar(255),
    email varchar(255),
    data_nascita DATE,
    ruolo varchar(255),
    logged boolean
);