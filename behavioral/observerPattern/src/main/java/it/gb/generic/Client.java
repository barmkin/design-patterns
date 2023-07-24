package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {
        System.out.println("OK");

        // Create subject
        Subject subject1 = new ConcreteSubject();

        // Add 2 observers
        ConcreteObserver tempObserver = new ConcreteObserver("Temporary Observer", subject1);
        new ConcreteObserver("Static Observer", subject1);

        // Update state
        subject1.setState("A");

        // Detach observer
        subject1.detach(tempObserver);

        // Update state
        subject1.setState("B");
    }

}
