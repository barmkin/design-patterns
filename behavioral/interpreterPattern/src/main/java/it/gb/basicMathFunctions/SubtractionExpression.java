package it.gb.basicMathFunctions;

public class SubtractionExpression implements Expression {

    private double term1;
    private double term2;

    public SubtractionExpression(Expression e1, Expression e2) throws InvalidCommandException {
        super();
        this.term1 = e1.interpret();
        this.term2 = e1.interpret();
    }
    public SubtractionExpression(Expression e1, double d1) throws InvalidCommandException {
        super();
        this.term1 = e1.interpret();
        this.term2 = d1;
    }
    public SubtractionExpression(double d1, Expression e1) throws InvalidCommandException {
        super();
        this.term1 = d1;
        this.term2 = e1.interpret();
    }
    public SubtractionExpression(double d1, double d2) {
        super();
        this.term1 = d1;
        this.term2 = d2;
    }

    @Override
    public double interpret() {
        return this.term1 - this.term2;
    }
    
}
