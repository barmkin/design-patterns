package it.gb;

import it.gb.generic.Client;
import it.gb.organizationalHierarchy.OrganizationalHierachyApp;

public class CompositePattern {
    public static enum examples_list {
        generic,
        organizationalHierachy
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (CompositePattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Composite Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (CompositePattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (CompositePattern.examples_list.organizationalHierachy.name().equals(arg)) {
                    OrganizationalHierachyApp.executeOrganizationalHierachyApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    CompositePattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            CompositePattern.printValidArgs();
        }
    }

}
