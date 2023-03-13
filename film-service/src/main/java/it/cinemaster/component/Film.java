package it.cinemaster.component;

import java.time.format.DateTimeFormatter;

public class Film {
    private int idFilm;
    private DateTimeFormatter dataOra;
    private String autore;
    private int durata;
    private double prezzo;
    private String categoria;
    private String descrizione;
    public Film(int idFilm, DateTimeFormatter dataOra, String autore, int durata, double prezzo, String categoria, String descrizione){
        this.idFilm = idFilm;
        this.dataOra = dataOra;
        this.autore = autore;
        this.durata = durata;
        this.prezzo = prezzo;
        this.categoria = categoria;
        this.descrizione = descrizione;
    }
    public int getIdFilm(){ return idFilm; }
    public void setIdFilm(int idFilm){ this.idFilm = idFilm; }
    public DateTimeFormatter getDataOra(){ return dataOra; }
    public void setDataOra(DateTimeFormatter dataOra){ this.dataOra = dataOra; }
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
