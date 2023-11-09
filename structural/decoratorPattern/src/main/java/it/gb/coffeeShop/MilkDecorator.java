package it.gb.coffeeShop;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float getCost() {
        return this.wrappedCoffee.getCost() + 0.25f;
    }

    @Override
    public String getDecription() {
        return this.wrappedCoffee.getDecription() + " + milk";
    }
    
}
