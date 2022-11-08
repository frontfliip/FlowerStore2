package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Flower class.
 */
@Getter
@Setter
@NoArgsConstructor
public final class Flower {

    private int id;
    /**
     * flower's sepalLength.
     */
    private Double sepalLength;
    /**
     * flower's color.
     */
    private FlowerColor color;
    /**
     * flower's price.
     */
    private Double price;
    /**
     * flower's type.
     */
    private FlowerType type;

    @Override
    public String toString() {
        return this.type + "{"
                + "sepalLength=" + sepalLength
                + ", color=" + color.userFriendly()
                + ", price=" + price
                + ", type=" + type
                + ", id=" + id
                + '}';
    }

    /**
     * @param flowerId unique id
     * @param flowerColor flowerColor.
     * @param flowerPrice flowerPrice
     * @param flowerType flowerType
     * @param sepallLength sepallLength
     */
    public Flower(final int flowerId, final FlowerColor flowerColor,
                  final Double flowerPrice, final FlowerType flowerType,
                  final Double sepallLength) {
        this.color = flowerColor;
        this.price = flowerPrice;
        this.type = flowerType;
        this.sepalLength = sepallLength;
        this.id = flowerId;
    }
}
