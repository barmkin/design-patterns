package it.gb.generic;

public class ConcreteStateB implements State {

    private Context context;

    public ConcreteStateB(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("Transition from B to A");
        context.setCurrentState(context.getStateA());
    }

    @Override
    public String toString() {
        return "State B";
    }
    
}
