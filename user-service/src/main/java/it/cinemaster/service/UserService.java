package it.cinemaster.service;

import it.cinemaster.response.ProfileResponse;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.cinemaster.entity.Login;
import it.cinemaster.entity.User;
import it.cinemaster.repository.UserRepository;

import java.io.FileReader;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public ProfileResponse getProfile(String email){
        Optional<User> u = userRepository.getByEmail(email);
        if(u.isPresent()){
            ProfileResponse profileResponse = new ProfileResponse();
            profileResponse.setNome(u.get().getNome());
            profileResponse.setCognome(u.get().getCognome());
            profileResponse.setDataNascita(u.get().getDataNascita());
            profileResponse.setEmail(u.get().getEmail());
            return profileResponse;
        }
        return null;
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
