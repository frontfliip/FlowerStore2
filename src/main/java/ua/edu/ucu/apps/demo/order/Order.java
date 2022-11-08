package ua.edu.ucu.apps.demo.order;

import lombok.*;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.flower.FlowerPack;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class Order {

    private int id;
    private List<FlowerBucket> flowerBuckets;
    public double getPrice() {
        return flowerBuckets.stream().mapToDouble(FlowerBucket::getPrice).sum();
    }
}
