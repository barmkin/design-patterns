package it.gb.generic;

public class ShortList implements Collection<Short> {

    private ListIterator listIterator;
    private Short[] concreteShortList = {};

    public ShortList(Short[] initialList) {
        super();
        this.concreteShortList = initialList;
        this.listIterator = new ListIterator(this);
    }

    protected Short[] getConcreteShortList() {
        return concreteShortList;
    }


    @Override
    public Iterator<Short> iterator() {
        return listIterator;
    }
    
}
