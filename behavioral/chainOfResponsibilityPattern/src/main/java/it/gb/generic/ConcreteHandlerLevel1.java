package it.gb.generic;

import it.gb.generic.task.GenericTask;

public class ConcreteHandlerLevel1 implements Handler {

    private Handler next;

    @Override
    public void execute(GenericTask task) {
        if (task.getTaskLevel() <= 1) {
            System.out.println("ConcreteHandlerLevel1 can execute task " + task.getTaskName());
        } else {
            System.out.println("[ConcreteHandlerLevel1 cannot execute task " + task.getTaskName() + "]");
            next.execute(task);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.next = handler;
    }
    
}
