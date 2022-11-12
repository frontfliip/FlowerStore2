package ua.edu.ucu.apps.demo.flower;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;
import ua.edu.ucu.apps.demo.item.Item;

import javax.persistence.Entity;
import javax.persistence.Table;
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
    public Double getPrice() {
        return packs.stream().mapToDouble(FlowerPack::calcPrice).sum();
    }

    @Override
    public String toString() {
        return "FlowerBucket{" +
                "packs=" + packs +
                '}';
    }
    @Override
    public String getDescription(){
        return toString();
    }
}
