package ua.edu.ucu.apps.demo.payment;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping(path = "/api/v1/payment")
@RestController
public class PaymentController {
    @GetMapping(path = "/all")
    public List<Payment> getPayments(){
        return List.of(new PayPalPayment(), new CreditCardPayment());
    }
}
