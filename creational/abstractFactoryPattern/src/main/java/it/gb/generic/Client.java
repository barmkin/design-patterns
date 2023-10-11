package it.gb.generic;


public abstract class Client {


    public static void executeGeneric() {
        System.out.println("Create Product A and B using factories");

        // Init factories
        AbstractFactory factory1 = new ConcreteFactoryAlfa();
        AbstractFactory factory2 = new ConcreteFactoryBravo();


        // Create product A using factory Alfa
        AbstractProduct product1 = factory1.orderProduct(ProductType.A);

        // Create product B using factory Bravo
        AbstractProduct product2 = factory2.orderProduct(ProductType.B);

        System.out.println(product1.toString());
        System.out.println(product2.toString());

        // Create product B using factory1
        AbstractProduct product3 = factory1.orderProduct(ProductType.B);

        // Create product A using factory2
        AbstractProduct product4 = factory2.orderProduct(ProductType.A);

        System.out.println(product3.toString());
        System.out.println(product4.toString());

    }

}
