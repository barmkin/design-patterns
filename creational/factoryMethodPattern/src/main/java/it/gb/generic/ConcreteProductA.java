package it.gb.generic;

public class ConcreteProductA implements Product {

    public ConcreteProductA() {
        super();
    }

    @Override
    public void printName() {
        System.out.println("Concrete Product A");
    }

    @Override
    public void printType() {
        System.out.println("Type Alfa-01 - " + this.toString());
    }
    
}
