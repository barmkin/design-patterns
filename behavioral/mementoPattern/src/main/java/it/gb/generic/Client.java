package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {
        // Create generic originator obj
        Originator originator = new Originator("State 1");
        System.out.println(originator.toString());
        // Save state via caretatker
        Caretaker caretaker = new Caretaker();
        caretaker.saveOriginator(originator);

        // change state
        originator.setState("State 2");
        System.out.println(originator.toString());

        // save
        caretaker.saveOriginator(originator);

        // change state
        originator.setState("Unstable state");
        System.out.println(originator.toString());

        // revert previous state
        caretaker.revertOriginator(originator);
        System.out.println(originator.toString());

        // revert previous state
        caretaker.revertOriginator(originator);
        System.out.println(originator.toString());
    }

}
