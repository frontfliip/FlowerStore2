package ua.edu.ucu.apps.demo.payment;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class PayPalPayment implements Payment {
    private  String name;

    private String description;

    public  PayPalPayment(){
        this.name = "PayPAl";
        this.description = "PayPal payment";
    }
    @Override
    public String pay() {
        return "paid with PayPal";
    }
}
