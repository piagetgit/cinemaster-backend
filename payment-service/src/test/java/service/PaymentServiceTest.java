package service;


import it.cinemaster.entity.Ticket;
import it.cinemaster.repository.PaymentRepository;
import it.cinemaster.service.PaymentService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class) // Run the test with MockitoJUnitRunner
public class PaymentServiceTest {
    @InjectMocks
    private PaymentService paymentService;
    @Mock
    private PaymentRepository paymentRepository;
    @Test //Junit Anotation
    public void getTicketByUserIdTest(){
        Mockito.when(paymentRepository.findByUserId(Mockito.any())).thenReturn(Optional.of(List.of(new Ticket())));
        List<Ticket>  res = paymentService.getTicketByUserId(Long.valueOf(0001));
        //verifier
        Assert.assertNotNull(res);
        Assert.assertEquals(1,res.size());
        Mockito.verify(paymentRepository,Mockito.times(1)).findByUserId(Mockito.any());
    }
    @Before public void initMocks() {
        MockitoAnnotations.openMocks(this);
    }
}
