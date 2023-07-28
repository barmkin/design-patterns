package it.gb.generic;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void execute(Context context) {
        System.out.println("Strategy A = multiply context value * 2");
        context.setValue(context.getValue() * 2);
        System.out.println(context.getValue());
    }
    
}
