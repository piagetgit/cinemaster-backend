package it.cinemaster.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name ="film")
/*@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id",
        scope = Film.class)*/
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @ApiModelProperty(position = 1)
    private Long id;
    @Column
    private Date dataOra;
    @Column
    private String autore;
    @Column
    private int durata;
    @Column
    private double prezzo;
    @Column
    private String categoria;
    @Column
    private String descrizione;
    /*public Film(Long id, Date dataOra, String autore, int durata, double prezzo, String categoria, String descrizione){
        this.id = id;
        this.dataOra = dataOra;
        this.autore = autore;
        this.durata = durata;
        this.prezzo = prezzo;
        this.categoria = categoria;
        this.descrizione = descrizione;
    }
    public long getId(){ return id; }
    public void setId(Long id){ this.id = id; }
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
    public void setDescrizione(String descrizione){ this.descrizione = descrizione; }*/
}
