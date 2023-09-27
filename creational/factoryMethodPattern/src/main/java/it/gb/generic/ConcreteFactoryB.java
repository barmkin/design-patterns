package it.gb.generic;

public class ConcreteFactoryB extends Factory {
    
    @Override
    public Product createProduct() {
        ConcreteProductB product = new ConcreteProductB();
        return product;
    }
}
