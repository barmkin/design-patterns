package it.gb.simpleDocumentWriter;

import java.util.ArrayList;
import java.util.List;

public class CommandsStack {
    public static final short MAX_STACK_SIZE = 3;
    List<Command> commandStack;

    public CommandsStack() {
        super();
        this.commandStack = new ArrayList<Command>();
    }

    public void push(Command c) {
        if (this.commandStack.size() >= CommandsStack.MAX_STACK_SIZE) {
            this.commandStack.remove(0);
        }
        this.commandStack.add(c);
    }

    public Command pop() {
        try {
            return this.commandStack.remove(this.commandStack.size() - 1);
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("WARN Stack is empty, current size is " + CommandsStack.MAX_STACK_SIZE);
            return null;
        }
    }
}
