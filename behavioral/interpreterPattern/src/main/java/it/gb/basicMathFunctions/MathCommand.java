package it.gb.basicMathFunctions;

public class MathCommand {

    private String operation;
    private Expression firstArgument; 
    private Expression secondArgument; 

    public MathCommand(String operation, Expression firstArgument, Expression secondArgument) {
        super();
        this.operation = operation;
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Expression getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(Expression firstArgument) {
        this.firstArgument = firstArgument;
    }

    public Expression getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(Expression secondArgument) {
        this.secondArgument = secondArgument;
    }
    
}
