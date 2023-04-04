package it.cinemaster.service;

import com.netflix.discovery.converters.Auto;
import it.cinemaster.entity.Film;
import it.cinemaster.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    public void createFilm(Film film){
        filmRepository.save(film);
    }

    public List<Film> getAllFilm(){
        List<Film> res = new ArrayList<>();
        filmRepository.findAll().forEach(f ->res.add(f));
        return  res;
    }
}
