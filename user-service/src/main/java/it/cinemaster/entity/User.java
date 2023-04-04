package it.cinemaster.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@NoArgsConstructor
@Table(name ="user_table")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Id
    private Long id;
    private String nome;
    private String cognome;

    private String password;
    private boolean logged;

    private String email;
    private Date dataNascita;
    private String ruolo;

    /*public User(int id, String nome, String cognome, String password, boolean logged, String email, Date dataNascita, String ruolo){
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
        this.logged = logged;
        this.email = email;
        this.dataNascita = dataNascita;
        this.ruolo = ruolo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public boolean getLogged() { return logged; }
    public void setLogged(boolean logged) { this.logged = logged; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Date getDataNascita() { return dataNascita; }
    public void setDataNascita(Date dataNascita) { this.dataNascita = dataNascita; }
    public String getRuolo() { return ruolo; }
    public void setRuolo(String ruolo) { this.ruolo = ruolo; }*/
}
