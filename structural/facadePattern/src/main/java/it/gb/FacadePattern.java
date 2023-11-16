package it.gb;

import it.gb.generic.Client;
import it.gb.onlineShoppingSystem.OnlineShoppingSystemApp;

public class FacadePattern {
    public static enum examples_list {
        generic,
        onlineShoppingSystem
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
                } else if (FacadePattern.examples_list.onlineShoppingSystem.name().equals(arg)) {
                    OnlineShoppingSystemApp.executeOnlineShoppingSystemApp();
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
