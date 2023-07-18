package it.gb.generic;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> originatorHistory;
    
    public Caretaker() {
        super();
        this.originatorHistory = new Stack<Memento>();
    }

    public void saveOriginator(Originator originator) {
        this.originatorHistory.push(originator.createMemento());
    }

    public void revertOriginator(Originator originator) {
        if (this.originatorHistory.empty()) {
            System.err.println("Cannot revert!");
            return;
        }
        
        originator.setMemento(this.originatorHistory.pop());
    }
}
