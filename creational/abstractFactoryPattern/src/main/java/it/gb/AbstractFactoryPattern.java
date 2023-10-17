package it.gb;

import it.gb.generic.Client;
import it.gb.crossPlatformUI.CrossPlatformUIApp;

public class AbstractFactoryPattern {
    public static enum examples_list {
        generic,
        crossPlatformUI
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (AbstractFactoryPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Abstract Factory Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (AbstractFactoryPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (AbstractFactoryPattern.examples_list.crossPlatformUI.name().equals(arg)) {
                    CrossPlatformUIApp.executeCrossPlatformUIApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    AbstractFactoryPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            AbstractFactoryPattern.printValidArgs();
        }
    }

}
