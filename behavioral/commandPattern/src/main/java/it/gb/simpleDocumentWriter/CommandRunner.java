package it.gb.simpleDocumentWriter;

// invoker
public class CommandRunner {
    
    CommandsStack commandsStack;

    public CommandRunner() {
        super();
        this.commandsStack = new CommandsStack();
    }
    
    public void storeAndExecute(Command c) {
        this.commandsStack.push(c);
        c.execute();
    }

    public void undo() {
        try {
            this.commandsStack.pop().undo();
        } catch (NullPointerException npe) {
            System.out.println("Cannot undo!");
        }
    }
}
