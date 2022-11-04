package ua.edu.ucu.apps.demo.payment;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayPalPayment implements Payment {
    private  String name;

    private String description;

    public  PayPalPayment(){
        name = "PayPAl";
        description = "PayPal payment";
    }

    public boolean pay(int amount){
        System.out.println("paid with PayPal");
        return true;
    }

    @Override
    public boolean pay() {
        return false;
    }
}
