package it.gb.generic;

public class ConcreteFactoryBravo extends AbstractFactory {

    @Override
    protected AbstractProduct createProduct(ProductType productType) {
        System.out.println("Factory Bravo - Creating product...");
        AbstractProduct product = null;
        switch (productType) {
            case A:
                product = new ConcreteProductA();
                break;
            case B:
                product = new ConcreteProductB();
                break;
            default:
                throw new IllegalArgumentException("Invalid product type " + productType.name());
        }

        if (product != null) {
            product.setFactoryCode("Bravo");
        }

        return product;
    }
    
}
