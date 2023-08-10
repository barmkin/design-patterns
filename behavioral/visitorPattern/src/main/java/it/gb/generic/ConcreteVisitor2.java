package it.gb.generic;

public class ConcreteVisitor2 implements Visitor {

    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("[Concrete Visitor 2] - Visiting a concrete element A");
        concreteElementA.operation();
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("[Concrete Visitor 2] - Visiting a concrete element B");
        concreteElementB.operation();
    }
    
}
