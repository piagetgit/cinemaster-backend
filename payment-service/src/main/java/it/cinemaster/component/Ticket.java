package it.cinemaster.component;

import java.time.format.DateTimeFormatter;

public class Ticket {
    private int idFilm;
    private int idUser;
    private int numeroPersone;
    private int numeroRidotti;
    private double prezzoTotale;
    private DateTimeFormatter dataOra;
    private String posti = "";
    public Ticket(int idFilm, int idUser, int numeroPersone, int numeroRidotti, double prezzoTotale, DateTimeFormatter dataOra, String posti){
        this.idFilm = idFilm;
        this.idUser = idUser;
        this.numeroPersone = numeroPersone;
        this.numeroRidotti = numeroRidotti;
        this.prezzoTotale = prezzoTotale;
        this.dataOra = dataOra;
        this.posti = posti;
    }

    public int getIdFilm(){ return idFilm; }
    public void setIdFilm(int idFilm){ this.idFilm = idFilm; }
    public int getIdUser(){ return idUser; }
    public void setIdUser(int idUser){ this.idUser = idUser; }
    public int getNumeroPersone(){ return numeroPersone; }
    public void setNumeroPersone(int numeroPersone){ this.numeroPersone = numeroPersone; }
    public int getNumeroRidotti(){ return numeroRidotti; }
    public void setNumeroRidotti(int numeroRidotti){ this.numeroRidotti = numeroRidotti; }
    public double getPrezzoTotale(){ return prezzoTotale; }
    public void setPrezzoTotale(double prezzoTotale){ this.prezzoTotale = prezzoTotale; }
    public DateTimeFormatter getDataOra(){ return dataOra; }
    public void setDataOra(DateTimeFormatter dataOra){ this.dataOra = dataOra; }
    public String getPosti(){ return posti; }
    public void setPosti(String posti){ this.posti = posti; }
}
