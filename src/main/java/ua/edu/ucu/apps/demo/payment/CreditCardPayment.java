package ua.edu.ucu.apps.demo.payment;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreditCardPayment implements Payment {
    private String name;

    private String description;

    public  CreditCardPayment(){
        name = "CreditCard";
        description = "CreditCard payment";
    }
    @Override
    public boolean pay(){
        System.out.println("paid with the credit card");
        return true;
    }
}
