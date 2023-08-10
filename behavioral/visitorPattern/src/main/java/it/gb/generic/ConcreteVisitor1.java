package it.gb.generic;

public class ConcreteVisitor1 implements Visitor {

    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("[Concrete Visitor 1] - Visiting a concrete element A");
        concreteElementA.operation();
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("[Concrete Visitor 1] - Visiting a concrete element B");
        concreteElementB.operation();
    }
    
}
