package it.gb.generic;

public abstract class Client {

  public static void executeGeneric() {

    System.out.println("Creating an Abstraction to interact with a ConcreteImplementorA");
    Abstraction abstraction = new Abstraction(new ConcreteImplementorA());
    abstraction.feature1();
    abstraction.feature2();
    abstraction.featureMix();

    System.out.println("Creating a RefinedAbstraction to interact with a ConcreteImplementorB");
    RefinedAbstraction refinedAbstraction = new RefinedAbstraction(new ConcreteImplementorB());
    refinedAbstraction.feature1();
    refinedAbstraction.feature2();
    refinedAbstraction.feature3();
    refinedAbstraction.featureMix();

  }

}
