package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {
        // Create Context
        Context context = new Context();

        System.out.println("Print current state");
        context.printCurrentState();

        // Transition 1
        context.executeStateTransition();

        System.out.println("Print current state");
        context.printCurrentState();

        // Transition 2
        context.executeStateTransition();

        System.out.println("Print current state");
        context.printCurrentState();
    }

}
