package ua.edu.ucu.apps.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.edu.ucu.apps.demo.flower.FlowerPack;
import ua.edu.ucu.apps.demo.flower.Inventory;

import java.util.List;

@Component
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private Inventory inventory;

    public int createOrder(Order order) {
        validateOrder(order);
        order.getFlowerBucket()
                .getPacks().forEach(
                        p -> p.setFlower(inventory.getById(p.getFlower().getId())));
        return orderRepository.save(order);
    }
    public List<Order> getOrders() {
        return orderRepository.getOrders();
    }

    private void validateOrder(Order order) {
        order.getFlowerBucket().getPacks()
                .forEach(p -> {
                    if (p.getQuantity() <= 0) {
                        throw new IllegalArgumentException("Quantity must be larger then zero");
                    }
                });

        order.getFlowerBucket().getPacks().stream()
                .map(FlowerPack::getFlower)
                .forEach(f -> {
                    if (inventory.getById(f.getId()) == null) {
                        throw new IllegalArgumentException("Wrong flower");
                    }
                });

    }
}
