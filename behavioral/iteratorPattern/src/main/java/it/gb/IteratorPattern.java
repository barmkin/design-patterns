package it.gb;

import it.gb.generic.Client;
import it.gb.musicLibrary.MusicLibraryApp;


public class IteratorPattern {
    public static enum examples_list  {
        generic,
        musicLibrary
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (IteratorPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Iterator Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (IteratorPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (IteratorPattern.examples_list.musicLibrary.name().equals(arg)) {
                    MusicLibraryApp.executeMusicLibraryApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    IteratorPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            IteratorPattern.printValidArgs();
        }
    }

}
