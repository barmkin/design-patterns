package it.gb.generic;

public abstract class AbstractBase {
    protected abstract void methodOne();
    protected abstract void methodTwo();

    public void templateMethod() {
        System.out.println("[Abstract Base Directive] First execute methodOne");
        this.methodOne();
        System.out.println("[Abstract Base Directive] Then execute methodTwo");
        this.methodTwo();
    }

}
