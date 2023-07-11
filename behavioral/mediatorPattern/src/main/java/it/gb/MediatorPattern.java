package it.gb;

import it.gb.generic.ConcreteMediator;

public class MediatorPattern {

    public static void executeGeneric() {
        ConcreteMediator mediator = new ConcreteMediator();

        mediator.assignTask1();
        mediator.assignTask2();
        mediator.assignTaskToAll();
    }

    public static void main(String[] args) {
        System.out.println("Hello, Mediator Pattern!");

        // uncomment to play generic mediator pattern to coordinate
        // assigning task
        executeGeneric();
    }
}
