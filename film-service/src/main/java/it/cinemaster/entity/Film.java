package it.cinemaster.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name ="films")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @ApiModelProperty(position = 1)
    private Long id;
    @Column
    private Date dataUscita;
    @Column
    private String regista;
    @Column
    private int durata;
    @Column
    private double prezzo;
    @Column
    private String categoria;

    @Column
    private String descrizione;
    @Column
    private String titolo;

   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "img", referencedColumnName = "img_name")*/
    private String img;
}
