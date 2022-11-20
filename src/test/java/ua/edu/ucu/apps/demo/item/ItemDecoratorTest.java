package ua.edu.ucu.apps.demo.item;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.FlowerColor;
import ua.edu.ucu.apps.demo.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class ItemDecoratorTest {
    private Item item = new Flower(1, FlowerColor.WHITE, 9.0, FlowerType.CHAMOMILE, 7.0);

    @Test
    void testRibbonDecoratorPrice() {
        ItemDecorator decorator = new RibbonDecorator(item);

        Double price = decorator.getPrice();

        assertEquals(9 + 40, price);
    }

    @Test
    void testRibbonDecoratorDescription() {
        ItemDecorator decorator = new RibbonDecorator(item);

        String description = decorator.getDescription();

        assertTrue(description.contains("Ribbon packing"));
        assertTrue(description.contains("CHAMOMILE"));
    }

    @Test
    void testPaperDecoratorPrice() {
        ItemDecorator decorator = new PaperDecorator(item);

        Double price = decorator.getPrice();

        assertEquals(9 + 13, price);
    }

    @Test
    void testPaperDecoratorDescription() {
        ItemDecorator decorator = new PaperDecorator(item);

        String description = decorator.getDescription();

        assertTrue(description.contains("Paper packing"));
        assertTrue(description.contains("CHAMOMILE"));
    }

    @Test
    void testBasketDecoratorPrice() {
        ItemDecorator decorator = new BasketDecorator(item);

        Double price = decorator.getPrice();

        assertEquals(9 + 4, price);
    }

    @Test
    void testBasketDecoratorDescription() {
        ItemDecorator decorator = new BasketDecorator(item);

        String description = decorator.getDescription();

        assertTrue(description.contains("Basket packing"));
        assertTrue(description.contains("CHAMOMILE"));
    }


}