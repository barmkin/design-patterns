package it.gb;

import it.gb.configurationManager.ConfigurationManagerApp;
import it.gb.generic.Client;

public class SingletonPattern {
    public static enum examples_list {
        generic,
        configurationManager
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (SingletonPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Singleton Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (SingletonPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (SingletonPattern.examples_list.configurationManager.name().equals(arg)) {
                    ConfigurationManagerApp.executeConfigurationManagerApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    SingletonPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            SingletonPattern.printValidArgs();
        }
    }

}
