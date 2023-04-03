package it.cinemaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import it.cinemaster.entity.Ticket;
import it.cinemaster.entity.Login;
import it.cinemaster.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("api/v1/cinemaster/payment")
@CrossOrigin(origins = "http://localhost:4200")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("ticket/buy")
    public ResponseEntity<Ticket> buyTicket(@RequestBody Ticket ticket){
        System.out.println("Begin buyTicket Body:"+ticket);
        Ticket res = paymentService.createTicket(ticket);

        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @GetMapping("/tickets/{userId}")
    public ResponseEntity<List<Ticket>> getTicketsByUser(@PathVariable("userId") Long userId){
        System.out.println("Begin getTicketsByUser userId:"+userId);
        List<Ticket> res = paymentService.getTicketByUserId(userId);
        System.out.println("end getTicketsByUser tickets:"+res);
        if(res==null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
