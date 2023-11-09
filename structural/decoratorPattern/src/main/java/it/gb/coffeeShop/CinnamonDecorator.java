package it.gb.coffeeShop;

public class CinnamonDecorator extends CoffeeDecorator {

    public CinnamonDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float getCost() {
        return this.wrappedCoffee.getCost() + 0.35f;
    }

    @Override
    public String getDecription() {
        return this.wrappedCoffee.getDecription() + " + cinnamon";
    }
    
}
