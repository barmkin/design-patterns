package it.gb.basicMathFunctions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CommandInterpreter {

    private static int countCharOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    /** 
     * Valid expression: [command]([number|expression], [number|expression])
     * Valid commands: sum | sub | mul | div 
     * */
    public static double interpretCommand(String command) throws InvalidCommandException {
        Expression foundExpression = null;
        Pattern pattern = Pattern.compile("^(sum|sub|mul|div)\\s*\\(((?:.*?)\\s*,\\s*(?:.*?))\\)$");
        Matcher matcher = pattern.matcher(command);
        String commandFound = null;
        String commandArguments = null;

        if (matcher.find()) {
            try {
                commandFound = matcher.group(1);
                commandArguments = matcher.group(2);
            } catch (IllegalStateException ise) {
                throw new InvalidCommandException("Cannot parse command", ise);
            }
        } else if (command.trim().matches("[0-9\\.]+")) {
            try {
                return Double.parseDouble(command);
            } catch (NumberFormatException nfe) {
                throw new InvalidCommandException("Cannot parse number", nfe);
            }
        } else {
            throw new InvalidCommandException("Not a valid expression!");
        }
    
        String[] commands = null;
        if (commandFound != null && commandArguments != null) {
            commands = commandArguments.split(",");
        } else {
            throw new InvalidCommandException("Cannot split argumentsS!");
        }

        // Check if starts with numbers
        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();
        int secondPartStartingIndex = 0;

        // Elaborate first part
        if (commands[0].trim().matches("[0-9\\.]+")) {
            part1.append(commands[0].trim());
            secondPartStartingIndex = 1;
        } else {
            int openedBrackets = 0;
            int closedBrackets = 0;
            int j = 0;
            for (int i = 0; i < commands.length; i++, j++) {
                String currPart = commands[i].trim();
                openedBrackets += CommandInterpreter.countCharOccurrences(currPart, '(');
                closedBrackets += CommandInterpreter.countCharOccurrences(currPart, ')');
                part1.append(currPart);
                if (openedBrackets == closedBrackets) {
                    break;
                } else {
                    part1.append(",");
                }
            }
            secondPartStartingIndex = j+1;
        } 

        // Append second part
        for (int k = secondPartStartingIndex; k<commands.length - 1; k++) {
            part2.append(commands[k].trim());
            part2.append(",");
        }
        part2.append(commands[commands.length - 1]);

        // Choose Expression
        if (commandFound.equals("sum")) {
            System.out.println("Execute sum, part1: " + part1.toString() + " , part2: " + part2.toString());
            foundExpression = new SumExpression(interpretCommand(part1.toString()), interpretCommand(part2.toString()));
        } else if (commandFound.equals("sub")) {
            System.out.println("Execute sub, part1: " + part1.toString() + " , part2: " + part2.toString());
            foundExpression = new SubtractionExpression(interpretCommand(part1.toString()), interpretCommand(part2.toString()));
        } else if (commandFound.equals("mul")) {
            System.out.println("Execute mul, part1: " + part1.toString() + " , part2: " + part2.toString());
            foundExpression = new MultiplicationExpression(interpretCommand(part1.toString()), interpretCommand(part2.toString()));
        } else if (commandFound.equals("div")) {
            System.out.println("Execute div, part1: " + part1.toString() + ", part2: " + part2.toString());
            foundExpression = new DivisionExpression(interpretCommand(part1.toString()), interpretCommand(part2.toString()));
        } else {
            throw new InvalidCommandException("Cannot execute command");
        }

        return foundExpression.interpret();
    }
}
