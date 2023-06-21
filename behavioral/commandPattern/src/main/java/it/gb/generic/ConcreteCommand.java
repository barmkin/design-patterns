package it.gb.generic;

public class ConcreteCommand implements Command {

    // state
    private boolean alreadyExecuted; 
    private Receiver receiver;

    public ConcreteCommand(Receiver r) {
        alreadyExecuted = false;
        this.receiver = r;
    }

    public boolean hasAlreadyExecuted() {
        return alreadyExecuted;
    }

    @Override
    public void execute() {
        this.receiver.action();
        alreadyExecuted = true;
    }
    
}
