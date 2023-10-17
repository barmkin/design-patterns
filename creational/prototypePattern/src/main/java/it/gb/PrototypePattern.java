package it.gb;

import it.gb.generic.Client;
import it.gb.cloningShapes.CloningShapesApp;

public class PrototypePattern {
    public static enum examples_list {
        generic,
        cloningShapes
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (PrototypePattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Prototype Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (PrototypePattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (PrototypePattern.examples_list.cloningShapes.name().equals(arg)) {
                    CloningShapesApp.executeCloningShapesApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    PrototypePattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            PrototypePattern.printValidArgs();
        }
    }

}
