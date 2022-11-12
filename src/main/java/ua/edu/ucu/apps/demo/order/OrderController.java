package ua.edu.ucu.apps.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.item.Item;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(path = "/create")
    public int createOrder(@RequestBody OrderRequest order) {
        Order o = new Order();
        for(Item item : order.getFlowerBuckets()) {
            o.addItem(item);
        }
        return orderService.createOrder(o);
    }

    @GetMapping(path = "/all")
    public List<Order> getAllOrders(){
        return orderService.getOrders();
    }
}
