package it.gb.basicMathFunctions;

public class DivisionExpression implements Expression {

    private double dividend;
    private double divisor;

    public DivisionExpression(Expression e1, Expression e2) throws InvalidCommandException {
        super();
        this.dividend = e1.interpret();
        this.divisor = e1.interpret();
    }
    public DivisionExpression(Expression e1, double d1) throws InvalidCommandException {
        super();
        this.dividend = e1.interpret();
        this.divisor = d1;
    }
    public DivisionExpression(double d1, Expression e1) throws InvalidCommandException {
        super();
        this.dividend = d1;
        this.divisor = e1.interpret();
    }
    public DivisionExpression(double d1, double d2) {
        super();
        this.dividend = d1;
        this.divisor = d2;
    }

    @Override
    public double interpret() throws InvalidCommandException {
        if (this.divisor == 0) {
            throw new InvalidCommandException("Cannot divide by 0");
        }
        return this.dividend / this.divisor;
    }
    
}
