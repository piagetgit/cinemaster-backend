package it.cinemaster.repository;

import it.cinemaster.entity.Film;
import it.cinemaster.entity.FilmImage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmImageRepository extends CrudRepository<FilmImage,Long> {
}
