package it.cinemaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import it.cinemaster.entity.Ticket;
import it.cinemaster.entity.Login;
import it.cinemaster.service.PaymentService;

@RestController
@RequestMapping("v1/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getTicket(@PathVariable("id") String idLogin){
        Ticket t = paymentService.getAmount(idLogin);
        return new ResponseEntity<>(t, HttpStatus.FOUND);
    }
    @PostMapping("/buy")
    public ResponseEntity<Ticket> buyTicket(@RequestBody Ticket ticket){
        return new ResponseEntity<>(paymentService.createTicket(ticket), HttpStatus.CREATED);
    }
}
