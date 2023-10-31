package it.gb;

import it.gb.generic.Client;

public class DecoratorPattern {
    public static enum examples_list {
        generic,
        todo
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (DecoratorPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Decorator Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (DecoratorPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (DecoratorPattern.examples_list.todo.name().equals(arg)) {
                    System.out.println("TODO");
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    DecoratorPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            DecoratorPattern.printValidArgs();
        }
    }

}
