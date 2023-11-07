package it.gb.generic;

public abstract class Client {

  public static void executeGeneric() {
    
    // Create component
    ConcreteComponent component = new ConcreteComponent();

    // Wrap with concrete decorator
    ConcreteDecorator decorator = new ConcreteDecorator(component);

    // Execute method
    decorator.execute();

  }

}
