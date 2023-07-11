package it.gb;

import it.gb.basicMathFunctions.CommandInterpreter;
import it.gb.basicMathFunctions.InvalidCommandException;
import it.gb.generic.Context;
import it.gb.generic.NonterminalExpression;
import it.gb.generic.TerminalExpression;

public class InterpreterPattern {

    public static void executeGeneric(String letter) {
        // Generic OR Interpreter pattern on string - setup terminal
        Context c1 = new Context("A");
        Context c2 = new Context("B");
        TerminalExpression t1 = new TerminalExpression(c1);
        TerminalExpression t2 = new TerminalExpression(c2);

        // Setup non terminal (Simple OR)
        NonterminalExpression nt1 = new NonterminalExpression(t1, t2);

        // Test input
        Context test = new Context(letter);
        System.out.println(nt1.interpret(test));

    }

    public static void main(String[] args) {
        System.out.println("Hello, Interpreter Pattern!");

        // uncomment to play generic pattern
        //InterpreterPattern.executeGeneric("B");

        // uncomment to play Basic Math Functions
        try {
            // 7 - -5 = 2
            String command = "sum(sub(7.05,1.55)  , div(9, mul(0.5, 4)))";
            double result = CommandInterpreter.interpretCommand(command);
            System.out.println(command + " = " + result);
        } catch (InvalidCommandException ice) {
            System.err.println("Check syntax!");
            ice.printStackTrace();
        }
    }
}
