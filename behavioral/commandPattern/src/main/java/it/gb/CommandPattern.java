package it.gb;

import it.gb.generic.ConcreteCommand;
import it.gb.generic.Invoker;
import it.gb.generic.Receiver;
import it.gb.simpleDocumentWriter.DocumentWriterApp;

public class CommandPattern {

    public static void executeGeneric() {
        Receiver receiver1 = new Receiver();
        ConcreteCommand command1 = new ConcreteCommand(receiver1);
        Invoker invoker = new Invoker();

        System.out.println(command1.hasAlreadyExecuted());
        invoker.execute(command1);
        System.out.println(command1.hasAlreadyExecuted());
    }

    public static void main(String[] args) {
        System.out.println("Hello, Command Pattern  Playground!");

        // uncomment to play generic pattern
        // CommandPattern.executeGeneric();    
        
        // uncomment to play Document Writer
        DocumentWriterApp.testDocumentWriter();
    }
}
