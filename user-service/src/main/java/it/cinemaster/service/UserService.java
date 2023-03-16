package it.cinemaster.service;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Service;
import it.cinemaster.component.Login;
import it.cinemaster.component.User;
import it.cinemaster.repository.UserRepository;

import java.io.FileReader;

@Service
public class UserService {
    public User getProfile(String email){
        JSONParser parser = new JSONParser();
        Object res = parser.parse(new FileReader("C:\\Users\\pietr\\Desktop\\Esame Prog-DV\\cinemaster-backend\\users.json"));
        JSONObje
    }

    public void newUser(User utente) {
    }

    public Object logUser(Login login) {
    }
}
