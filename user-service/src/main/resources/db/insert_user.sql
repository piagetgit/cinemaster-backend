CREATE TABLE if not exists User_table (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome varchar(255),
    cognome varchar(255),
    password varchar(255),
    mail varchar(255),
    data_nascita DATE,
    ruolo varchar(255)
);

