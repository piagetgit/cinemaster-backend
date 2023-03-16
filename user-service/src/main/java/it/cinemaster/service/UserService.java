package it.cinemaster.service;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.cinemaster.component.Login;
import it.cinemaster.component.User;
import it.cinemaster.repository.UserRepository;

import java.io.FileReader;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User getProfile(String email){
        JSONParser parser = new JSONParser();
        Object res = parser.parse(new FileReader("C:\\Users\\pietr\\Desktop\\Esame Prog-DV\\cinemaster-backend\\users.json"));
        JSONObject jsonObject = (JSONObject) res;
        JSONArray listaUtenti = JSONArray
    }

    public void newUser(User utente) {
        userRepository.save(utente);
    }

    public void logUser(Login login) {
        if(userRepository.fin)
    }
}
