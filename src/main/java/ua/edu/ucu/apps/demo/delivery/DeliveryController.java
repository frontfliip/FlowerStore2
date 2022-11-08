package ua.edu.ucu.apps.demo.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/api/v1/delivery")
@RestController
public class DeliveryController {

    @GetMapping(path = "/all")
    public List<Delivery> getDeliveries(){
        return List.of(new PostDeliveryStrategy(), new DHLDeliveryStrategy());
    }
}
