package ua.edu.ucu.apps.demo.delivery;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.item.Item;
import java.util.List;

@Getter
@Setter
public class DHLDeliveryStrategy implements Delivery{

    private String name;

    private String description;

    public  DHLDeliveryStrategy(){
        this.name = "DHLDelivery";
        this.description = "DHLDelivery delivery";
    }

    @Override
    public String deliver(List<Item> items) {
        return "the items have been delivered with the DHL";
    }
}
