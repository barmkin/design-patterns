package it.gb.coffeeShop;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float getCost() {
        return this.wrappedCoffee.getCost() + 0.15f;
    }

    @Override
    public String getDecription() {
        return this.wrappedCoffee.getDecription() + " + sugar";
    }
    
}
