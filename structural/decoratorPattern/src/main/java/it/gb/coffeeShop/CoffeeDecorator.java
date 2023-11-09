package it.gb.coffeeShop;

public abstract class CoffeeDecorator implements Coffee {
    
    Coffee wrappedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        super();
        this.wrappedCoffee = coffee;
    }

}
