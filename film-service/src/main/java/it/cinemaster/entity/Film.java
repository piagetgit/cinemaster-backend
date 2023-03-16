package it.cinemaster.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name ="film")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idFilm",
        scope = Film.class)
public class Film {
    @Id
    private long idFilm;
    private Date dataOra;
    private String autore;
    private int durata;
    private double prezzo;
    private String categoria;
    private String descrizione;
    public Film(int idFilm, Date dataOra, String autore, int durata, double prezzo, String categoria, String descrizione){
        this.idFilm = idFilm;
        this.dataOra = dataOra;
        this.autore = autore;
        this.durata = durata;
        this.prezzo = prezzo;
        this.categoria = categoria;
        this.descrizione = descrizione;
    }
    public long getIdFilm(){ return idFilm; }
    public void setIdFilm(int idFilm){ this.idFilm = idFilm; }
    public Date getDataOra(){ return dataOra; }
    public void setDataOra(Date dataOra){ this.dataOra = dataOra; }
    public String getAutore(){ return autore; }
    public void setAutore(String autore){ this.autore = autore; }
    public int getDurata(){ return durata; }
    public void setDurata(int durata){ this.durata = durata; }
    public double getPrezzo(){ return prezzo; }
    public void setPrezzo(double prezzo){ this.prezzo = prezzo; }
    public String getCategoria(){ return categoria; }
    public void setCategoria(String categoria){ this.categoria = categoria; }
    public String getDescrizione(){ return descrizione; }
    public void setDescrizione(String descrizione){ this.descrizione = descrizione; }
}
