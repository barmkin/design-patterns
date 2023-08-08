package it.gb;

import it.gb.generic.Client;
import it.gb.onlineLearningPlatform.OnlineLearningPlatformApp;

public class TemplateMethodPattern {
    public static enum examples_list {
        generic,
        onlineLearningPlatform
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (TemplateMethodPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Template Method Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (TemplateMethodPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric();
                } else if (TemplateMethodPattern.examples_list.onlineLearningPlatform.name().equals(arg)) {
                    OnlineLearningPlatformApp.executeOnlineLearningPlatformApp();
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    TemplateMethodPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            TemplateMethodPattern.printValidArgs();
        }
    }

}
