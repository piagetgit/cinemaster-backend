package it.cinemaster.controller;

import it.cinemaster.response.ProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import it.cinemaster.entity.User;
import it.cinemaster.entity.Login;
import it.cinemaster.service.UserService;

@RestController
@RequestMapping("v1/cinemaster/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<ProfileResponse> getProfile(@PathVariable("id") String email){
        ProfileResponse u= userService.getProfile(email);
       if (u==null){
           return new ResponseEntity<>(u,HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity<>(u, HttpStatus.FOUND);


    }

    @PostMapping("/register")
    public ResponseEntity<User> createProfile(@RequestBody User user){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }
    @PostMapping("/login")
    public ResponseEntity<Boolean> accessProfile(@RequestBody Login login){
        return new ResponseEntity<>(userService.logUser(login), HttpStatus.ACCEPTED);
    }
}
