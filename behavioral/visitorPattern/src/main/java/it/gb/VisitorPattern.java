package it.gb;

import it.gb.generic.Client;
import it.gb.zooAnimals.ZooAnimalsApp;

public class VisitorPattern {
    public static enum examples_list {
        generic,
        zooAnimals
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (VisitorPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Visitor Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (VisitorPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (VisitorPattern.examples_list.zooAnimals.name().equals(arg)) {
                    ZooAnimalsApp.executeZooAnimalsApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    VisitorPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            VisitorPattern.printValidArgs();
        }
    }

}
