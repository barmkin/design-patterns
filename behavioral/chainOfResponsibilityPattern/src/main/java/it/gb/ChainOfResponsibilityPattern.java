package it.gb;

import it.gb.generic.Client;
import it.gb.atmDispenserMachine.AtmApp;


public class ChainOfResponsibilityPattern {
    public static enum examples_list  {
        generic,
        atmDispenserMachine
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (ChainOfResponsibilityPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Chain of Responsibility Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (ChainOfResponsibilityPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (ChainOfResponsibilityPattern.examples_list.atmDispenserMachine.name().equals(arg)) {
                    AtmApp.executeAtmDispenserApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    ChainOfResponsibilityPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            ChainOfResponsibilityPattern.printValidArgs();
        }
    }

}
