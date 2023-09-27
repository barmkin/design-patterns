package it.gb.generic;

public class ConcreteFactoryA extends Factory {

    @Override
    public Product createProduct() {
        ConcreteProductA product = new ConcreteProductA();
        return product;
    }
    
}
