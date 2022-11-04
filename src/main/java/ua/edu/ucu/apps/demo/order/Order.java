package ua.edu.ucu.apps.demo.order;

import lombok.*;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;


@Getter
@Setter
@NoArgsConstructor
public class Order {

    private int id;
    FlowerBucket flowerBucket;

}
