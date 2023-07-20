package it.gb;

import it.gb.generic.Client;
import it.gb.simpleFileManager.SimpleFileManagerApp;

public class MementoPattern {
    public static enum examples_list  {
        generic,
        simpleFileManager
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (MementoPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Memento Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (MementoPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (MementoPattern.examples_list.simpleFileManager.name().equals(arg)) {
                    SimpleFileManagerApp.executeSimpleFileManagerApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    MementoPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            MementoPattern.printValidArgs();
        }
    }

}

