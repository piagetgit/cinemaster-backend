package it.cinemaster.component;

import java.util.Date;

public class User {

    private int id;
    private String nome;
    private String cognome;
    private String password;
    private String email;
    private Date dataNascita;
    private String ruolo;

    public User(int id, String nome, String cognome, String password, String email, Date dataNascita, String ruolo){
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
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
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Date getDataNascita() { return dataNascita; }
    public void setDataNascita(Date dataNascita) { this.dataNascita = dataNascita; }
    public String getRuolo() { return ruolo; }
    public void setRuolo(String ruolo) { this.ruolo = ruolo; }
}
