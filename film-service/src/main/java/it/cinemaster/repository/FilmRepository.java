package it.cinemaster.repository;

import it.cinemaster.entity.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Film,Long> {
}
