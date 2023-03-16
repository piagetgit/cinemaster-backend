package it.cinemaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import it.cinemaster.component.User;
import it.cinemaster.component.Login;
import it.cinemaster.service.UserService;

@RestController
@RequestMapping("v1/cinemaster/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getProfile(@PathVariable("id") String email){
       User u= userService.getProfile(email);
       return new ResponseEntity<>(u, HttpStatus.FOUND);
    }

    @PostMapping("/register")
    public ResponseEntity<User> createProfile(@RequestBody User user){
        User u =userService.createUser(user);
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }
    @PostMapping("/login")
    public ResponseEntity<Boolean> accessProfile(@RequestBody Login login){
        return new ResponseEntity<>(userService.logUser(login), HttpStatus.ACCEPTED);
    }
}
