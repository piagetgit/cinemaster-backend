DROP TABLE if exists tickets;
CREATE TABLE tickets (
    id SERIAL,
    film_id INT,
    user_id VARCHAR(255),
    numero_persone INT,
    prezzo_totale FLOAT,
    data_ora TIMESTAMP,
    numero_ridotti INT,
    pagato boolean,
    posti VARCHAR(255)
);