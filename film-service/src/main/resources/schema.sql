DROP TABLE if exists film;
CREATE TABLE if not exists film (
    id SERIAL PRIMARY KEY,
    titolo varchar(255),
    data_uscita DATE,
    regista varchar(255),
    durata int,
    prezzo float,
    categoria varchar(255),
    descrizione varchar(1023),
    img varchar(255)
);