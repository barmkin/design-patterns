package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {
        // Create a ConcreteBuilder to build a Product
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        concreteBuilder
            .buildBaseProduct(101289, "T-Shirt")
            .addDescription("A simple t-shirt")
            .addPriceTag(12);

        Product tshirt = new Product(concreteBuilder);

        System.out.println(tshirt);
    }

}
