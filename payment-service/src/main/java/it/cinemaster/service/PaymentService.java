package it.cinemaster.service;

import it.cinemaster.entity.Ticket;
import it.cinemaster.entity.Login;
import it.cinemaster.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    public Ticket getAmount(String idLogin) {
        Optional<Ticket> l = paymentRepository.getByIdUser(idLogin);
        return null;
    }

    public Ticket createTicket(Ticket ticket) {
        return paymentRepository.save(ticket);
    }
}
