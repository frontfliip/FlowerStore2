package ua.edu.ucu.apps.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.edu.ucu.apps.demo.flower.Flower;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(path = "/create")
    public int createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping(path = "/all")
    public List<Order> getAllOrders(){
        return orderService.getOrders();
    }
}
