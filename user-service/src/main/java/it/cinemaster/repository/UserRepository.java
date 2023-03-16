package it.cinemaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.cinemaster.component.User;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
