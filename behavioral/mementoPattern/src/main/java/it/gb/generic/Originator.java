package it.gb.generic;

public class Originator {
    private String state;

    public Originator(String state) {
        super();
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);

        return memento;
    }

    protected void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    @Override
    public String toString() {
        return "Originator [state=" + state + "]";
    }
}
