package it.gb.generic;

import java.util.ArrayList;
import java.util.List;

import it.gb.generic.task.ConcreteTask;

public abstract class Client {
    
    public static void executeGeneric() {
        // -------------- GENERIC TASK EXAMPLE -------------------------------
        // Init handlers
        ConcreteHandlerLevel1 lowHanler = new ConcreteHandlerLevel1();
        ConcreteHandlerLevel2 mediumHandler = new ConcreteHandlerLevel2();
        ConcreteHandlerLevel3 highHandler = new ConcreteHandlerLevel3();
        ConcreteHandlerLevelMax allHandler = new ConcreteHandlerLevelMax();
        lowHanler.setNextHandler(mediumHandler);
        mediumHandler.setNextHandler(highHandler);
        highHandler.setNextHandler(allHandler);

        // Init tasks
        List<ConcreteTask> tasksList = new ArrayList<ConcreteTask>();
        tasksList.add(new ConcreteTask(1, "Level 1 task"));
        tasksList.add(new ConcreteTask(2, "Level 2 task"));
        tasksList.add(new ConcreteTask(3, "Level 3 task"));
        tasksList.add(new ConcreteTask(10000, "Level 10000 task"));

        for (ConcreteTask concreteTask : tasksList) {
            lowHanler.execute(concreteTask);
        }
    }    
}
