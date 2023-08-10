package it.gb.generic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ObjectStructure implements Iterable<Element> {

    List<Element> listOfConcreteElements;

    public ObjectStructure() {
        super();
        this.listOfConcreteElements = new LinkedList<Element>();
    }

    public boolean addConcreteElement(Element element) {
        return this.listOfConcreteElements.add(element);
    }

    public boolean removeConcreteElement(Element element) {
        return this.listOfConcreteElements.remove(element);
    }

    @Override
    public Iterator<Element> iterator() {
       return this.listOfConcreteElements.iterator();
    }
    
}
