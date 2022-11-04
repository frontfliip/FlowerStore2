package ua.edu.ucu.apps.demo.flower;

import lombok.*;
import ua.edu.ucu.apps.demo.item.Item;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FlowerBucket extends Item {
    private List<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack flowers) {
        this.packs.add(flowers);
    }

    @Override
    public double getPrice() {
        return packs.stream().mapToDouble(FlowerPack::calcPrice).sum();
    }

}
