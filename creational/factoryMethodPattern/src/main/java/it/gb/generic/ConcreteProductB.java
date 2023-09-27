package it.gb.generic;

public class ConcreteProductB implements Product {

    public ConcreteProductB() {
        super();
    }

    @Override
    public void printName() {
        System.out.println("Concrete Product B");
    }

    @Override
    public void printType() {
        System.out.println("Type Beta-02 - " + this.toString());
    }
}
