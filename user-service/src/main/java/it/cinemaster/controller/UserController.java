package it.cinemaster.controller;

import it.cinemaster.entity.SignupResponse;
import it.cinemaster.response.ProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import it.cinemaster.entity.User;
import it.cinemaster.entity.Login;
import it.cinemaster.service.UserService;

@RestController
@RequestMapping("api/v1/cinemaster/user")
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

    @PostMapping("/signup")
    public ResponseEntity<SignupResponse> createProfile(@RequestBody User u){
        User user = userService.createUser(u);
        SignupResponse res = new SignupResponse();
        if(user==null){
            res.setCode("4004");
            res.setMessage("Email Already exists. Choose different email");
            return new ResponseEntity<>(res, HttpStatus.OK);
        }
        res.setCode("2002");
        res.setMessage("SUCCESS");
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @PostMapping("/login")
    public ResponseEntity<ProfileResponse> accessProfile(@RequestBody Login login){
        System.out.println("Begin login: "+ login.toString());
        return new ResponseEntity<>(userService.logUser(login), HttpStatus.ACCEPTED);
    }
}
