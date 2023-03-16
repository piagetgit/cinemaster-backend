package it.cinemaster.repository;

import org.springframework.stereotype.Repository;
import it.cinemaster.component.User;

import java.util.Date;

@Repository
public class UserRepository extends User{
    public UserRepository(int id, String nome, String cognome, String password, boolean logged, String email, Date dataNascita, String ruolo) {
        super(id, nome, cognome, password, logged, email, dataNascita, ruolo);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }
}
