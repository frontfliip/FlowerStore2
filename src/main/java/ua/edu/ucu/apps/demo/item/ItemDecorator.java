package ua.edu.ucu.apps.demo.item;

public abstract class ItemDecorator extends Item{
    @Override
    public abstract Double getPrice();

    @Override
    public abstract String getDescription();
}
