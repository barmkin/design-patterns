package it.gb;

import it.gb.generic.Client;
import it.gb.simpleDocumentWriter.DocumentWriterApp;


public class CommandPattern {
    public static enum examples_list  {
        generic,
        simpleDocumentWriter
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (CommandPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Command Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (CommandPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (CommandPattern.examples_list.simpleDocumentWriter.name().equals(arg)) {
                    DocumentWriterApp.executeDocumentWriterApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    CommandPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            CommandPattern.printValidArgs();
        }
    }

}
