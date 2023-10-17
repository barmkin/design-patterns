package it.gb;

import it.gb.generic.Client;
import it.gb.legacyPrinterIntegration.LegacyPrinterIntegrationApp;

public class AdapterPattern {
    public static enum examples_list {
        generic,
        legacyPrinterIntegration
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (AdapterPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Adapter Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (AdapterPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (AdapterPattern.examples_list.legacyPrinterIntegration.name().equals(arg)) {
                    LegacyPrinterIntegrationApp.executeLegacyPrinterIntegrationApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    AdapterPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            AdapterPattern.printValidArgs();
        }
    }

}
