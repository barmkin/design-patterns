package it.gb.basicMathFunctions;

public class MultiplicationExpression implements Expression {

    private double factor1;
    private double factor2;

    public MultiplicationExpression(Expression e1, Expression e2) throws InvalidCommandException {
        super();
        this.factor1 = e1.interpret();
        this.factor2 = e1.interpret();
    }
    public MultiplicationExpression(Expression e1, double d1) throws InvalidCommandException {
        super();
        this.factor1 = e1.interpret();
        this.factor2 = d1;
    }
    public MultiplicationExpression(double d1, Expression e1) throws InvalidCommandException {
        super();
        this.factor1 = d1;
        this.factor2 = e1.interpret();
    }
    public MultiplicationExpression(double d1, double d2) {
        super();
        this.factor1 = d1;
        this.factor2 = d2;
    }

    @Override
    public double interpret() {
        return this.factor1 * this.factor2;
    }
    
}
