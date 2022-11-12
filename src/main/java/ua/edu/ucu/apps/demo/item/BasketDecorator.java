package ua.edu.ucu.apps.demo.item;

public class BasketDecorator extends ItemDecorator{
    private Item item;

    public BasketDecorator(Item item){
        this.item = item;
    }
    @Override
    public Double getPrice(){
        return item.getPrice() + 4;
    }

    @Override
    public String getDescription(){
        return "Basket packing with " + item.getDescription();
    }

}
