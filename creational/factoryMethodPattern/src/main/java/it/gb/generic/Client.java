package it.gb.generic;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {

    private static enum productType {
        A,
        B
    }

    private static Product getNewProduct(productType p) {
        if (p == null) {
            return null;
        }

        Factory factoryA = new ConcreteFactoryA();
        Factory factoryB = new ConcreteFactoryB();

        Factory selectedFactory = null;

        switch (p) {
            case A:
                selectedFactory = factoryA;
                break;
            case B:
                selectedFactory = factoryB;
                break;
            default:
                System.err.println("Cannot create product of type " + p.name());
                return null;
        }

        return selectedFactory.createProduct();
    }

    public static void executeGeneric() {
        // Define product list
        List<productType> productTypesList = new ArrayList<>();
        
        productTypesList.add(productType.A);
        productTypesList.add(productType.A);
        productTypesList.add(productType.B);

        // Call factory selector
        for (productType productType : productTypesList) {
            Product product = Client.getNewProduct(productType);
            product.printName();
            product.printType();
        }

    }

}
