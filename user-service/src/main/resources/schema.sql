DROP TABLE if exists user_table;
CREATE TABLE if not exists user_table (
    id SERIAL PRIMARY KEY,
    nome varchar(255),
    cognome varchar(255),
    password varchar(255) NOT NULL,
    email varchar(255) UNIQUE NOT NULL,
    data_nascita DATE,
    ruolo varchar(255),
    logged boolean
);