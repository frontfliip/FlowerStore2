package ua.edu.ucu.apps.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flower.*;
import ua.edu.ucu.apps.demo.item.Item;
import ua.edu.ucu.apps.demo.item.ItemDecorator;
import ua.edu.ucu.apps.demo.item.PaperDecorator;
import ua.edu.ucu.apps.demo.item.RibbonDecorator;
import ua.edu.ucu.apps.demo.payment.CreditCardPayment;

import java.util.List;

@Component
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private FlowerRepository flowerRepository;

    public int createOrder(Order order) {
        for (int i=0; i < order.getItems().size(); i++){
            if (order.getItems().get(i) instanceof FlowerBucket fb) {
                for (FlowerPack p : fb.getPacks()) {
                    p.setFlower(flowerRepository.getById(p.getFlower().getId()));
                }
                ItemDecorator decorator = new PaperDecorator(fb);
                decorator = new RibbonDecorator(decorator);
                order.getItems().set(i, decorator);
            }
        }

        order.setDelivery(new PostDeliveryStrategy());
        order.setPayment(new CreditCardPayment());
        return orderRepository.save(order);
    }
    public List<Order> getOrders() {
        return orderRepository.getOrders();
    }

    public String status(int id){
        Order order = orderRepository.getById(id);
        return order.processOrder();
    }

/*    private void validateOrder(Order order) {
        for (FlowerBucket fb : order.getItems()) {
            for (FlowerPack p : fb.getPacks()) {
                if (p.getQuantity() <= 0) {
                    throw new IllegalArgumentException("Quantity must be larger then zero");
                }
            }

            for (FlowerPack flowerPack : fb.getPacks()) {
                Flower f = flowerPack.getFlower();
                if (!flowerRepository.exists(Example.of(f))) {
                    throw new IllegalArgumentException("Wrong flower");
                }
            }
        }
    }*/
}
