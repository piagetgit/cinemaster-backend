package it.cinemaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.cinemaster.component.Login;
import it.cinemaster.component.User;
import it.cinemaster.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User getProfile(String email){
        return  userRepository.getById(email);
    }

    public User createUser(User user) {
        return  userRepository.save(user);
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
