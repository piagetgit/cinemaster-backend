package it.cinemaster.controller;

import it.cinemaster.entity.FilmRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/cinemaster")
@CrossOrigin(origins = "http://localhost:4200")
public class FilmServiceController {
    @PostMapping(value = "/film")
    public ResponseEntity<String> createFilm(@RequestBody FilmRequest filmRequest){
        return new ResponseEntity<>("Created",HttpStatus.CREATED);
    }

    @GetMapping(value = "/film")
    public ResponseEntity<String> getFilm(){
        return new ResponseEntity<>("Film",HttpStatus.CREATED);
    }
}
