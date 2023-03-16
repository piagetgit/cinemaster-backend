package it.cinemaster.service;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.cinemaster.component.Login;
import it.cinemaster.component.User;
import it.cinemaster.repository.UserRepository;

import java.io.FileReader;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User getProfile(String email){
        return  userRepository.getById(email);
    }

    public User createUser(User user) {
        User u = userRepository.save(user);
        return  u;
    }

    public boolean logUser(Login login) {
        Optional<User> u = userRepository.findById(login.getId());

        if (u.isPresent()){
            if(u.get().getPassword().equals(login.getLogPassword())){
                return true;
            }
        }

        return false;
    }
}
