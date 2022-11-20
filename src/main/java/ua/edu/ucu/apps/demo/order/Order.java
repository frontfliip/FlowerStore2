package ua.edu.ucu.apps.demo.order;

import lombok.*;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.item.Item;
import ua.edu.ucu.apps.demo.payment.Payment;
import ua.edu.ucu.apps.demo.user.UserInterface;

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
    private List<UserInterface> users = new ArrayList<>();

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
        String paymentInfo = payment.pay();
        notifyUsers("Payment completed");
        String deliveryInfo = delivery.deliver(items);
        notifyUsers("The items are delivered");
        return "Order processed, " + paymentInfo + ", " + deliveryInfo ;
    }
    public void notifyUsers(String status){
        for(UserInterface user : users){
            user.update(status);
        }
    }

}
