package it.gb.generic;

public class Invoker {
    public void execute(Command command) {
        command.execute();
    }
}
