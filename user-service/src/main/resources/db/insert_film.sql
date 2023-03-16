CREATE TABLE if not exists Film (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titolo varchar(255),
    data_uscita DATE,
    regista varchar(255),
    durata int,
    prezzo float,
    categoria varchar(255),
    descrizione varchar(1023),
    img varchar(255)
);



INSERT INTO Film (id,titolo,data_uscita,regista,durata,prezzo,categoria,descrizione,img)
VALUES (0001, 'Die Hart the Movie', '2023-03-03', 'Eric Appel', 92, 15, 'Azione', 'Kevin Hart, è impegnato in una missione dove sfida la morte per diventare una star di azione. E con un piccolo aiuto da parte di John Travolta, Nathalie Emmanuel e Josh Hartnett, potrebbe farcela.', 'die_hart.jpg'),
(0002, 'Unlocked', '2023-03-09', 'Kim Tae-joon', 100, 18, 'Drammatico', 'La vita di una donna viene stravolta dopo che un uomo pericoloso entra in possesso del suo cellulare smarrito e lo usa per seguire ogni sua mossa.', 'unlocked.jpg'),
(0003, 'Dog Gone', '2023-05-01', 'Stephen Herek', 88, 15, 'Per famiglie', 'Quando il suo amato cane scompare, un giovane si imbarca in una incredibile ricerca con i suoi genitori per trovarlo e dargli un farmaco salvavita.', 'dog_gone.jpg'),
(0004, 'True Spirit', '2023-08-10', 'Danny Ruhlmann', 96, 15, 'Azione', 'Una tenace adolescente australiana insegue i suoi sogni, e affronta le sue paure, mentre si accinge a diventare la più giovane persona a navigare in solitaria intorno al mondo.', 'true_spirit.jpg');