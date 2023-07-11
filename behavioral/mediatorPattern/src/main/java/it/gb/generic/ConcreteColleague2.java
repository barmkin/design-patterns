package it.gb.generic;

public class ConcreteColleague2 implements Colleague {
    Mediator mediator;

    public ConcreteColleague2(Mediator mediator) {
        super();
        this.mediator = mediator;
    }

    @Override
    public void doTask() {
        System.out.println("Collegue 2 is executing his task...");
    }
}
