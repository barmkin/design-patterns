package it.gb.generic;

import it.gb.generic.task.GenericTask;

public class ConcreteHandlerLevel2 implements Handler {

    private Handler next;

    @Override
    public void execute(GenericTask task) {
        if (task.getTaskLevel() <= 2) {
            System.out.println("\tConcreteHandlerLevel2 can execute task " + task.getTaskName());
        } else {
            System.out.println("\t[ConcreteHandlerLevel2 cannot execute task " + task.getTaskName() + "]");
            next.execute(task);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.next = handler;
    }
    
}
