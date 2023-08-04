package it.gb.generic;

public class ConcreteClass extends AbstractBase {

    @Override
    protected void methodOne() {
        System.out.println("[Concrete Class] Called method #1");
    }

    @Override
    protected void methodTwo() {
        System.out.println("[Concrete Class] Called method #2");
    }
    
}
