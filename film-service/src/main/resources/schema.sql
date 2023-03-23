DROP TABLE if exists films;
DROP TABLE if exists film_images;
CREATE TABLE if not exists films (
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
CREATE TABLE if not exists film_images (
    id SERIAL PRIMARY KEY,
    img_name varchar(255),
    img_data bytea
);

