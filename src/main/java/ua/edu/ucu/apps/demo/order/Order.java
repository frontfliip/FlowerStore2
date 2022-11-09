package ua.edu.ucu.apps.demo.order;

import lombok.*;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.flower.FlowerPack;
import ua.edu.ucu.apps.demo.payment.CreditCardPayment;
import ua.edu.ucu.apps.demo.payment.Payment;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class Order {

    private int id;
    private Payment payment;
    private Delivery delivery;
    private List<FlowerBucket> flowerBuckets;
    public double getPrice() {
        return flowerBuckets.stream().mapToDouble(FlowerBucket::getPrice).sum();
    }
    public void setPayment() { this.payment = new CreditCardPayment();}
    public void setDelivery() {
        this.delivery = new PostDeliveryStrategy();
    }
}
