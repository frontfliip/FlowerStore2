package ua.edu.ucu.apps.demo.delivery;

import ua.edu.ucu.apps.demo.item.Item;

import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items);
}
