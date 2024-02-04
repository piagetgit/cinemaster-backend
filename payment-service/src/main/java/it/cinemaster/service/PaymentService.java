package it.cinemaster.service;

import it.cinemaster.entity.Ticket;
import it.cinemaster.entity.Login;
import it.cinemaster.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    public Ticket createTicket(Ticket ticket) {
        return paymentRepository.save(ticket);
    }

    public List<Ticket> getTicketByUserId(Long userId){
        Optional<List<Ticket>> tickets=paymentRepository.findByUserId(userId);

        if(tickets.isPresent()){
            if(tickets.get().size()!=0)   return tickets.get();
        }
        return  null;
    }
}
