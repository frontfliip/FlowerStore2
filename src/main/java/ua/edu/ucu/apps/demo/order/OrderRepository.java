package ua.edu.ucu.apps.demo.order;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderRepository {

    int counter = 0;
    private final List<Order> orders = new ArrayList<>();
    public int save(Order order) {
        order.setId(counter);
        counter++;
        orders.add(order);
        return order.getId();
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public Order getById(int id){
        return orders.get(id);
    }
}
