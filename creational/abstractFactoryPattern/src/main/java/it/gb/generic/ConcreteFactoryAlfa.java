package it.gb.generic;

public class ConcreteFactoryAlfa extends AbstractFactory {

    @Override
    protected AbstractProduct createProduct(ProductType productType) {
        System.out.println("Factory Alfa - Creating product...");
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
            product.setFactoryCode("Alfa");
        }

        return product;
    }
    
}
