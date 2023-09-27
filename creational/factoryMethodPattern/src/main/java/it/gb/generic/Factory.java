package it.gb.generic;

public abstract class Factory {
    public abstract Product createProduct();
    
    public void printProductInfo() {
        Product product = this.createProduct();
        product.printName();
        product.printType();
    }
}
