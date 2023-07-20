package it.gb;

import it.gb.generic.Client;
import it.gb.basicMathFunctions.BasicMathFunctionsApp;


public class InterpreterPattern {
    public static enum examples_list  {
        generic,
        basicMathFunctions
    };

    private static void printValidArgs() {
        System.out.println("List of valid arguments:");
        for (InterpreterPattern.examples_list example : examples_list.values()) {
            System.out.println(example.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, Interpreter Pattern Playground!");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (InterpreterPattern.examples_list.generic.name().equals(arg)) {
                    Client.executeGeneric("B");
                } else if (InterpreterPattern.examples_list.basicMathFunctions.name().equals(arg)) {
                    BasicMathFunctionsApp.executeBasicMathFunctionsApp(
                        "sum(sub(7.05,1.55)  , div(9, mul(0.5, 4)))");
                } else {
                    System.out.println("Cannot find example \"" + arg + "\". Check args!");
                    InterpreterPattern.printValidArgs();
                }
            }
        } else {
            System.out.println("Add arg like \"generic\" to play examples.");
            InterpreterPattern.printValidArgs();
        }
    }

}
