package it.gb.generic;

public abstract class Client {

    public static void executeGeneric() {
        Receiver receiver1 = new Receiver();
        ConcreteCommand command1 = new ConcreteCommand(receiver1);
        Invoker invoker = new Invoker();

        System.out.println(command1.hasAlreadyExecuted());
        invoker.execute(command1);
        System.out.println(command1.hasAlreadyExecuted());
    }
    
}
