package it.gb;

import it.gb.generic.Client;
import it.gb.vendingMachine.VendingMachineApp;

public class StatePattern {
    public static enum examples_list {
        generic,
        vendingMachine
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (StatePattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, State Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (StatePattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (StatePattern.examples_list.vendingMachine.name().equals(arg)) {
                    VendingMachineApp.executeVendingMachineApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    StatePattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            StatePattern.printValidArgs();
        }
    }

}
