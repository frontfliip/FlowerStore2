package ua.edu.ucu.apps.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {
    @Autowired
    private Inventory inventory;

    @Autowired
    private FlowerService flowerService;

    @GetMapping(path = "/search")
    public List<Flower> getFlowers(
            @RequestParam(required = false) Double sepalLength,
            @RequestParam(required = false) FlowerColor color,
            @RequestParam(required = false) Double price,
            @RequestParam(required = false) FlowerType type) {
        return flowerService.searchFlowers(sepalLength, price, color, type);
    }

    @GetMapping(path = "/all")
    public List<Flower> gelAllFlowers(){return flowerService.getAllFlowers();}

    @PostMapping(path = "/add")
    public Flower addFlower(@RequestBody Flower flower){
        return flowerService.addFlower(flower);
    }
}



