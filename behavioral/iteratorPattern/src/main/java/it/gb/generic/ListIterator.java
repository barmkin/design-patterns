package it.gb.generic;

public class ListIterator implements Iterator<Short> {

    private ShortList shortList;
    private int currentElementIndex;

    public ListIterator(ShortList shortList) {
        super();
        this.shortList = shortList;
        currentElementIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return this.shortList != null && this.shortList.getConcreteShortList().length > currentElementIndex;
    }

    @Override
    public Short next() {
        return this.shortList.getConcreteShortList()[currentElementIndex++];
    }
    
}
