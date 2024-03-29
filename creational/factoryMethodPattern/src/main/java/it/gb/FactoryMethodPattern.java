package it.gb;

import it.gb.generic.Client;
import it.gb.videoGameCharacterFactory.VideoGameCharacterFactoryApp;

public class FactoryMethodPattern {
    public static enum examples_list {
        generic,
        videoGameCharacterFactory
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (FactoryMethodPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Factory Method Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (FactoryMethodPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (FactoryMethodPattern.examples_list.videoGameCharacterFactory.name().equals(arg)) {
                    VideoGameCharacterFactoryApp.executeVideoGameCharacterFactoryApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    FactoryMethodPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            FactoryMethodPattern.printValidArgs();
        }
    }

}
