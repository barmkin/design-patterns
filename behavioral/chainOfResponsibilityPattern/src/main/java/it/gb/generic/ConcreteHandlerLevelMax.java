package it.gb.generic;

import it.gb.generic.task.GenericTask;

public class ConcreteHandlerLevelMax implements Handler {

    @Override
    public void execute(GenericTask task) {
        System.out.println("\t\t\tConcreteHandlerLevelMax can execute any task. Can execute " + task.getTaskName());
    }

    @Override
    @Deprecated
    public void setNextHandler(Handler handler) {
        System.err.println("[ERROR] This handler can execute all tasks, you should not set a next handler!");
    }
    
}
