package ua.edu.ucu.apps.demo.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.item.Item;
import ua.edu.ucu.apps.demo.payment.Payment;
import ua.edu.ucu.apps.demo.user.User;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OrderRequest {
    private List<FlowerBucket> flowerBuckets;
    private int receiverId;
    private int senderId;
}
