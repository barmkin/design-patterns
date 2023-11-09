package it.gb.coffeeShop;

public class SimpleCoffee implements Coffee {

    @Override
    public float getCost() {
        return 1.00f;
    }

    @Override
    public String getDecription() {
        return "A coffee";
    }
    
}
