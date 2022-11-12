package ua.edu.ucu.apps.demo.item;

public class RibbonDecorator extends ItemDecorator{
    private Item item;

    public RibbonDecorator(Item item){
        this.item = item;
    }
    @Override
    public Double getPrice(){
        return item.getPrice() + 40;
    }

    @Override
    public String getDescription(){
        return "Ribbon packing with " + item.getDescription();
    }
}
