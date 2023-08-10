package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {

        // Create Object Structure and elements
        ObjectStructure elements = new ObjectStructure();
        elements.addConcreteElement(new ConcreteElementA());
        elements.addConcreteElement(new ConcreteElementB());

        // Create Visitors
        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();

        // Walks through elements - visitor 1
        for (Element element : elements) {
            element.accept(visitor1);
        }

        // Walks through elements - visitor 2
        for (Element element : elements) {
            element.accept(visitor2);
        }

    }

}
