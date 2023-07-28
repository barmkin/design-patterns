package it.gb.generic;

public class ConcreteStrategyB implements Strategy {

    @Override
    public void execute(Context context) {
        System.out.println("Strategy B = multiply context value * 10");
        context.setValue(context.getValue() * 10);
        System.out.println(context.getValue());
    }
    
}
