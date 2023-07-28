package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {
        // Create context
        Context context = new Context(450);

        // Set strategy
        context.setContextStrategy(new ConcreteStrategyA());

        // Execute request
        context.request();

        // Execute a request but change strategy first
        context.setContextStrategy(new ConcreteStrategyB());
        context.request();
    }

}
