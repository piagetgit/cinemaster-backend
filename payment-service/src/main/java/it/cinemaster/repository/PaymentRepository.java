package it.cinemaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.cinemaster.entity.Login;
import it.cinemaster.entity.Ticket;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Ticket, Long>{
    //Optional<Ticket> getByIdUser(String idUser);
    Optional<List<Ticket>> findByUserId(Long userId);
}
