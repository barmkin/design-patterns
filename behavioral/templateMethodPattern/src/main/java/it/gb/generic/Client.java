package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {
        // Create Concrete Class
        ConcreteClass concreteClass = new ConcreteClass();
        
        // Execute template method described in Abstract Base
        concreteClass.templateMethod();
    }

}
