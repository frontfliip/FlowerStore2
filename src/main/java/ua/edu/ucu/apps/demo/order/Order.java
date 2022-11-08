package ua.edu.ucu.apps.demo.order;

import lombok.*;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class Order {

    private int id;
    private List<FlowerBucket> flowerBuckets;

}
