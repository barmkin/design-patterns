package it.gb.basicMathFunctions;

public abstract class BasicMathFunctionsApp {
    
    public static void executeBasicMathFunctionsApp() {
        // Configuration, mathematical expression to be tested
        String mathFunction = "sum(sub(7.05,1.55)  , div(9, mul(0.5, 4)))";

        try {
            double result = CommandInterpreter.interpretCommand(mathFunction);
            System.out.println(mathFunction + " = " + result);
        } catch (InvalidCommandException ice) {
            System.err.println("Check syntax!");
            ice.printStackTrace();
        }
    }
}
