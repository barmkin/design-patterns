package it.gb.basicMathFunctions;

public abstract class BasicMathFunctionsApp {
    
    public static void executeBasicMathFunctionsApp(String mathFunction) {
        try {
            double result = CommandInterpreter.interpretCommand(mathFunction);
            System.out.println(mathFunction + " = " + result);
        } catch (InvalidCommandException ice) {
            System.err.println("Check syntax!");
            ice.printStackTrace();
        }
    }
}
