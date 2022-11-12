package ua.edu.ucu.apps.demo.item;

public class PaperDecorator extends ItemDecorator{
    private Item item;

    public PaperDecorator(Item item){
        this.item = item;
    }

    @Override
    public Double getPrice(){
        return item.getPrice() + 13;
    }

    @Override
    public String getDescription(){
        return "Paper packing with " + item.getDescription();
    }
}
