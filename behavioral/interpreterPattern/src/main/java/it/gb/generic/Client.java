package it.gb.generic;

public abstract class Client {
    
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
}
