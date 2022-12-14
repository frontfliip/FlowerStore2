package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.demo.item.Item;

import javax.persistence.*;

/**
 * Flower class.
 */
@Getter
@Setter
@Entity
@Table(name="flower")
@NoArgsConstructor
public final class Flower extends Item{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flower_jpa_sequence_generator")
    @SequenceGenerator(name = "flower_jpa_sequence_generator", sequenceName = "flower_id_sequence")
    @Column(name="id")
    private Integer id;

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
    @Override
    public Double getPrice(){
        return price;
    }

    @Override
    public String getDescription(){
        return toString();
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
