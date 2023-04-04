package it.cinemaster.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileResponse {
    private  String nome;
    private String cognome;
    private Long id;

    private Date dataNascita;
    private String email;

}
