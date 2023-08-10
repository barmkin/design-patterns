package it.gb.generic;

public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public void operation() {
        System.out.println("[ConcreteElementB - " 
            + (Object)this.toString() 
            + "] Operation");
    }
    
}
