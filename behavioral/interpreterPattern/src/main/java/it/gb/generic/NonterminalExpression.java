package it.gb.generic;

public class NonterminalExpression implements AbstractExpression {

    AbstractExpression expression1;
    AbstractExpression expression2;

    public NonterminalExpression(AbstractExpression expression1, AbstractExpression expression2) {
        super();
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(Context context) {
        // Generic Or
        return this.expression1.interpret(context) || this.expression2.interpret(context);
    }
    
}
