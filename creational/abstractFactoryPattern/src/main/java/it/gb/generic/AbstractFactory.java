package it.gb.generic;

public abstract class AbstractFactory {
    
    protected abstract AbstractProduct createProduct(ProductType productType);

    public AbstractProduct orderProduct(ProductType productType) {
        AbstractProduct product = this.createProduct(productType);
        return product;
    }

}
