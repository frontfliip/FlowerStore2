package ua.edu.ucu.apps.demo.flower;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class FlowerPack {
    private int quantity;
    private Flower flower;

    public FlowerPack(Flower flower, int quantity) {
        this.quantity = quantity;
        this.flower = flower;
    }
    public double calcPrice() {
        return this.getFlower().getPrice() * this.getQuantity();
    }
}
