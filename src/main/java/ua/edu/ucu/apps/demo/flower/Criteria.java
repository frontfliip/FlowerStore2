package ua.edu.ucu.apps.demo.flower;



/**
 * Criteria for search.
 */

public final class Criteria {

    /**
     * sepalLength.
     */
    private final Double sepalLength;

    /**
     * color.
     */
    private final FlowerColor color;

    /**
     * maxPrice.
     */
    private final Double maxPrice;

    /**
     * type.
     */
    private final FlowerType type;


    /**
     * Constructor.
     *
     * @param flowerType type
     * @param flowerColor color
     * @param flowerMaxPrice maxPrice
     * @param flowerSepalLength sepalLength
     */
    public Criteria(final FlowerType flowerType,
                    final FlowerColor flowerColor,
                    final Double flowerMaxPrice,
                    final Double flowerSepalLength) {
        this.type = flowerType;
        this.color = flowerColor;
        this.maxPrice = flowerMaxPrice;
        this.sepalLength = flowerSepalLength;
    }

    /**
     * Getter.
     * @return sepal length
     */
    public Double getSepalLength() {
        return sepalLength;
    }

    /**
     * `Getter.
      * @return color
     */
    public FlowerColor getColor() {
        return color;
    }

    /**
     * Getter.
     * @return max price
     */
    public Double getMaxPrice() {
        return maxPrice;
    }

    /**
     * Getter.
     * @return type
     */
    public FlowerType getType() {
        return type;
    }

}
