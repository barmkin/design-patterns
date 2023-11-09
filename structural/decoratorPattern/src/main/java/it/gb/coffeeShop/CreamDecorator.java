package it.gb.coffeeShop;

public class CreamDecorator extends CoffeeDecorator {

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float getCost() {
        return this.wrappedCoffee.getCost() + 1.05f;
    }

    @Override
    public String getDecription() {
        return this.wrappedCoffee.getDecription() + " + cream";
    }
    
}
