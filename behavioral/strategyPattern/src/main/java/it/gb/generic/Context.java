package it.gb.generic;

public class Context {
    
    private int value;
    private Strategy contextStrategy;

    public Context(int value) {
        super();
        this.value = value;
        this.contextStrategy = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setContextStrategy(Strategy contextStrategy) {
        this.contextStrategy = contextStrategy;
    }
    
    public void request() {
        if (this.contextStrategy == null) {
            System.err.println("ERROR - Cannot execute. Please set Context Strategy");
            return;
        }
        this.contextStrategy.execute(this);
    }

}
