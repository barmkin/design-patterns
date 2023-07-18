package it.gb;

import java.util.ArrayList;
import java.util.List;

import it.gb.atmDispenserMachine.AtmDispenser;
import it.gb.atmDispenserMachine.AtmDispenser50;
import it.gb.atmDispenserMachine.AtmDispenser20;
import it.gb.atmDispenserMachine.AtmDispenser10;
import it.gb.generic.ConcreteHandlerLevel1;
import it.gb.generic.ConcreteHandlerLevel2;
import it.gb.generic.ConcreteHandlerLevel3;
import it.gb.generic.ConcreteHandlerLevelMax;
import it.gb.generic.task.ConcreteTask;

public class ChainOfResponsibility {

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

    public static void executeAtmDispenserExample() {
        // -------------- ATM -----------------------------
        AtmDispenser atm = new AtmDispenser();
        AtmDispenser50 dispenser50 = new AtmDispenser50(15);
        AtmDispenser20 dispenser20 = new AtmDispenser20(40);
        AtmDispenser10 dispenser10 = new AtmDispenser10(400);

        atm.setNextDispenser(dispenser50);
        dispenser50.setNextDispenser(dispenser20);
        dispenser20.setNextDispenser(dispenser10);

        System.out.println(atm.dispenseReceipt(580));
        System.out.println(atm.dispenseReceipt(530));
        System.out.println(atm.dispenseReceipt(456));
        System.out.println(atm.dispenseReceipt(400));
        System.out.println(atm.dispenseReceipt(80));
        System.out.println(atm.dispenseReceipt(3970));
    }

    public static void main(String[] args) {
        System.out.println("Hello, Chain of Responsibility Pattern Playground!");

        // uncomment to play generic pattern
        // ChainOfResponsibility.executeGeneric();

        // uncomment to play atm dispenser example
        // ChainOfResponsibility.executeAtmDispenserExample();        
    }
}
