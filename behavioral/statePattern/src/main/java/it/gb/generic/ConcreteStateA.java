package it.gb.generic;

public class ConcreteStateA implements State {

    private Context context;

    public ConcreteStateA(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("Transition from A to B");
        context.setCurrentState(context.getStateB());
    }

    @Override
    public String toString() {
        return "State A";
    }
    
}
