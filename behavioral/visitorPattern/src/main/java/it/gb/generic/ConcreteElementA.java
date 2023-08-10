package it.gb.generic;

public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public void operation() {
        System.out.println("[ConcreteElementA - " 
            + (Object)this.toString() 
            + "] Operation");
    }
}
