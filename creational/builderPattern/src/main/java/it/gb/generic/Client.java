package it.gb.generic;

import java.time.LocalDate;

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

        // Create another product
        concreteBuilder = new ConcreteBuilder();
        concreteBuilder
            .buildBaseProduct(239487, "Snack")
            .addDescription("Snack")
            .setExpirationDate(LocalDate.of(2023, 9, 12))
            .addPriceTag(2.4f);

        Product snack = new Product(concreteBuilder);
        
        System.out.println(snack);
    }

}
