package ua.edu.ucu.apps.demo.order;

import lombok.*;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.item.Item;
import ua.edu.ucu.apps.demo.payment.Payment;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class Order {

    private int id;
    private Payment payment;
    private Delivery delivery;
    private List<Item> items = new ArrayList<>();

    public double getPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
    public void setPayment(Payment payment) { this.payment = payment;}
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public String processOrder(){
        String toReturn = "Order processed, " + payment.pay() + ", " +  delivery.deliver(items);
        return toReturn;
    }

}
