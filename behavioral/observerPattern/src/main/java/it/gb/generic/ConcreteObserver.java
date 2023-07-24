package it.gb.generic;

public class ConcreteObserver extends Observer {
    private String observerName;
    private Subject observedSubject;
    private String observerState;

    public ConcreteObserver(String observerName, Subject subject) {
        super();
        this.observerName = observerName;
        subject.attach(this);
        this.observedSubject = subject;
        this.observerState = subject.getState();
    }

    @Override
    public void update() {
        this.observerState = this.observedSubject.getState();
        System.out.format("Observer %S - Observed object changed! New state: %s%n", this.observerName, this.observerState);
    }
}
