package it.cinemaster.component;

import java.time.format.DateTimeFormatter;

public class Showing {
    private int idFilm;
    private DateTimeFormatter dataOra;
    private int postiMax = 100;
    public Showing(int idFilm, DateTimeFormatter dataOra, int postiMax){
        this.idFilm = idFilm;
        this.dataOra = dataOra;
        this.postiMax = postiMax;
    }
    public int getIdFilm(){ return idFilm; }
    public void setIdFilm(int idFilm){ this.idFilm = idFilm; }
    public DateTimeFormatter getDataOra(){ return dataOra; }
    public void setDataOra(DateTimeFormatter dataOra){ this.dataOra = dataOra; }
    public int getPostiMax(){ return postiMax; }
}
