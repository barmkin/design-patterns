package it.gb;

import it.gb.generic.Client;

public class FacadePattern {
    public static enum examples_list {
        generic,
        todo
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (FacadePattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Facade Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (FacadePattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (FacadePattern.examples_list.todo.name().equals(arg)) {
                    System.out.println("TODO");
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    FacadePattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            FacadePattern.printValidArgs();
        }
    }

}
