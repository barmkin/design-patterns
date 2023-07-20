package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {
        ConcreteMediator mediator = new ConcreteMediator();

        mediator.assignTask1();
        mediator.assignTask2();
        mediator.assignTaskToAll();
    }
    
}
