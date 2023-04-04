package it.cinemaster.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="film_images")
public class FilmImage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column(name="img_name")
    private String imageName;

    @Column(name="img_data")
    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] imageData;
}
