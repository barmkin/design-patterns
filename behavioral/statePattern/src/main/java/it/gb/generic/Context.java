package it.gb.generic;

public class Context {
    
    private State currentState;
    private State stateA;
    private State stateB;

    public Context() {
        super();
        this.stateA = new ConcreteStateA(this);
        this.stateB = new ConcreteStateB(this);
        this.currentState = stateA;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getStateA() {
        return this.stateA;
    }

    public State getStateB() {
        return this.stateB;
    }

    public void printCurrentState() {
        System.out.println(this.currentState.toString());
    }

    public void executeStateTransition() {
        this.currentState.handle();
    }
    

}
