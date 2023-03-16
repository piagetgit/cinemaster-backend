package it.cinemaster.controller;

import it.cinemaster.entity.Film;
import it.cinemaster.entity.FilmRequest;
import it.cinemaster.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/cinemaster")
@CrossOrigin(origins = "http://localhost:4200")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @PostMapping(value = "/film")
    public ResponseEntity<String> createFilm(@RequestBody FilmRequest filmRequest){
        Film f = new Film();
        f.setId(filmRequest.getId());

        filmService.createFilm(f);
        return new ResponseEntity<>("Created",HttpStatus.CREATED);
    }

    @GetMapping(value = "/film")
    public ResponseEntity<String> getFilm(){
        return new ResponseEntity<>("Film",HttpStatus.CREATED);
    }
}
