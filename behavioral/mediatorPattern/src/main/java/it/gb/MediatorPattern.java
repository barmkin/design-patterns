package it.gb;

import it.gb.generic.Client;
import it.gb.simpleChat.SimpleChatApp;


public class MediatorPattern {
    public static enum examples_list  {
        generic,
        simpleChat
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (MediatorPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Mediator Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (MediatorPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (MediatorPattern.examples_list.simpleChat.name().equals(arg)) {
                    SimpleChatApp.executeSimpleChatApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    MediatorPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            MediatorPattern.printValidArgs();
        }
    }

}
