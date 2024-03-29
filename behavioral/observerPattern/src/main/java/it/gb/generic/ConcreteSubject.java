package it.gb.generic;

public class ConcreteSubject extends Subject {
    private String state;

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
        this.notifyObserver();
    }

}
