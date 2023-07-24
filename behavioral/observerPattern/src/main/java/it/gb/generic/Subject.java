package it.gb.generic;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers;

    public Subject() {
        super();
        observers = new ArrayList<Observer>();
    }

    public abstract String getState();

    public abstract void setState(String state);

    public boolean attach(Observer observer) {
        return this.observers.add(observer);
    }

    public boolean detach(Observer observer) {
        return this.observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
