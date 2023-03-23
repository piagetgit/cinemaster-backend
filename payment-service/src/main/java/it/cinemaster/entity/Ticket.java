package it.cinemaster.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idFilm;
    private String idUser;
    private int numeroPersone;
    private int numeroRidotti;
    private double prezzoTotale;
    private Date dataOra;
    private String posti = "";
    public Ticket(int idFilm, String idUser, int numeroPersone, int numeroRidotti, double prezzoTotale, Date dataOra, String posti){
        this.idFilm = idFilm;
        this.idUser = idUser;
        this.numeroPersone = numeroPersone;
        this.numeroRidotti = numeroRidotti;
        this.prezzoTotale = prezzoTotale;
        this.dataOra = dataOra;
        this.posti = posti;
    }

    /*public int getIdFilm(){ return idFilm; }
    public void setIdFilm(int idFilm){ this.idFilm = idFilm; }
    public String getIdUser(){ return idUser; }
    public void setIdUser(String idUser){ this.idUser = idUser; }
    public int getNumeroPersone(){ return numeroPersone; }
    public void setNumeroPersone(int numeroPersone){ this.numeroPersone = numeroPersone; }
    public int getNumeroRidotti(){ return numeroRidotti; }
    public void setNumeroRidotti(int numeroRidotti){ this.numeroRidotti = numeroRidotti; }
    public double getPrezzoTotale(){ return prezzoTotale; }
    public void setPrezzoTotale(double prezzoTotale){ this.prezzoTotale = prezzoTotale; }
    public DateTimeFormatter getDataOra(){ return dataOra; }
    public void setDataOra(DateTimeFormatter dataOra){ this.dataOra = dataOra; }
    public String getPosti(){ return posti; }
    public void setPosti(String posti){ this.posti = posti; }*/
}
