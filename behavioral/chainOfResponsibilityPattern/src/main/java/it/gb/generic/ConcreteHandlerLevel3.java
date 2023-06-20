package it.gb.generic;

import it.gb.generic.task.GenericTask;

public class ConcreteHandlerLevel3 implements Handler {

    private Handler next;

    @Override
    public void execute(GenericTask task) {
        if (task.getTaskLevel() <= 3) {
            System.out.println("\t\tConcreteHandlerLevel3 can execute task " + task.getTaskName());
        } else {
            System.out.println("\t\t[ConcreteHandlerLevel3 cannot execute task " + task.getTaskName() + "]");
            next.execute(task);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.next = handler;
    }
    
}
