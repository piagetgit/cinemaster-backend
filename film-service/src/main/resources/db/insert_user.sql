CREATE TABLE if not exists User_table (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome varchar(255),
    cognome varchar(255),
    password varchar(255),
    mail varchar(255),
    data_nascita DATE,
    ruolo varchar(255)
);


INSERT INTO User_table (id,nome,cognome,password,mail,data_nascita,ruolo)
VALUES (0001, 'Alice', 'Corvetto', 'alccrvtt', 'alice.corvetto@cmail.it', '1999-03-03 00:00:00', 'utente'),
(0002, 'Marco', 'Donati', 'mrcdnt', 'marco.donati@cmail.it', '2001-05-05 00:00:00', 'utente'),
(0003, 'Giovanni', 'Roselli', 'gvnnrsll', 'giovanni_roselli@cmail.it', '2000-04-04 00:00:00', 'utente'),
(0004, 'Luca', 'Grazioli', 'cinemaster_77456', 'admin_luca@cinemaster.com', '1970-01-01 00:00:00', 'admin'),
(0005, 'Sara', 'Flori', 'cinemaster_33245', 'admin_sara@cinemaster.it', '1970-01-01 00:00:00', 'admin');