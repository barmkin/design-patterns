package it.gb.generic;

public class ConcreteColleague1 implements Colleague {

    Mediator mediator;

    public ConcreteColleague1(Mediator mediator) {
        super();
        this.mediator = mediator;
    }

    @Override
    public void doTask() {
        System.out.println("Collegue 1 is executing his task...");
    }
    
}
