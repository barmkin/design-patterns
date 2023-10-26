package it.gb.generic;

public class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        super();
        this.implementor = implementor;
    }

    public void feature1() {
        System.out.println("[Abstraction] Calling method 1");
        implementor.method1();
    }

    public void feature2() {
        System.out.println("[Abstraction] Calling method 2");
        implementor.method2();
    }

    public void featureMix() {
        System.out.println("[Abstraction] Calling method 1 and 2");
        implementor.method1();
        implementor.method2();
    }
}
