package it.gb.generic;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void feature3() {
        System.out.println("[RefinedAbstraction] Call method 3");
        implementor.method3();
    }
    
}
