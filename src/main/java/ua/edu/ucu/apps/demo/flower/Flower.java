package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Flower class.
 */
@Getter
@Setter
@Entity
@Table(name="flower")
@NoArgsConstructor
public final class Flower {

    @Id
    @Column(name="id")
    private int id;

    /**
     * flower's sepalLength.
     */
    @Column(name="sepal_length")
    private Double sepalLength;

    /**
     * flower's color.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="color")
    private FlowerColor color;

    /**
     * flower's price.
     */
    @Column(name="price")
    private Double price;

    /**
     * flower's type.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="type")
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
