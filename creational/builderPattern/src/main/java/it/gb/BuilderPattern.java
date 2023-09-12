package it.gb;

import it.gb.generic.Client;
import it.gb.pizzaBuilder.PizzaBuilderApp;

public class BuilderPattern {
    public static enum examples_list {
        generic,
        pizzaBuilder
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (BuilderPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Builder Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (BuilderPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (BuilderPattern.examples_list.pizzaBuilder.name().equals(arg)) {
                    PizzaBuilderApp.executePizzaBuilderApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    BuilderPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            BuilderPattern.printValidArgs();
        }
    }

}
