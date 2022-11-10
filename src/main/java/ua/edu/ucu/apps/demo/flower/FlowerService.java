package ua.edu.ucu.apps.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;


import java.beans.Expression;
import java.util.List;

@Component

public class FlowerService {

    @Autowired
    private FlowerRepository flowerRepository;
    public List<Flower> getAllFlowers(){
        return flowerRepository.findAll();
    }

    public Flower addFlower(Flower flower){
        if (!flowerRepository.exists(Example.of(flower))) {
            flowerRepository.save(flower);
            return flower;
        } else{
            throw new RuntimeException();
        }
    }

    public List<Flower> searchFlowers(Double sepalLength, Double price,FlowerColor color, FlowerType type){
        return flowerRepository.getBySepalLengthAndPriceAndColorAndType(sepalLength, price, color, type);
    }
}
