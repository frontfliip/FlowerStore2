package ua.edu.ucu.apps.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {
    @Autowired
    private Inventory inventory;

    @GetMapping(path = "/search")
    public List<Flower> getFlowers(
            @RequestParam double sepalLength,
            @RequestParam FlowerColor color,
            @RequestParam double maxPrice,
            @RequestParam FlowerType type) {
        Criteria c = new Criteria(type, color, maxPrice, sepalLength);
        return inventory.search(c);
    }

    @GetMapping(path = "/all")
    public List<Flower> gelAllFlowers(){
        return inventory.getAllFlowers();
    }
}



