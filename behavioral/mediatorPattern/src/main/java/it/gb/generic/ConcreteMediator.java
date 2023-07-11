package it.gb.generic;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    List<Colleague> colleagues;
    ConcreteColleague1 colleague1;
    ConcreteColleague2 colleague2;

    public ConcreteMediator() {
        super();
        colleague1 = new ConcreteColleague1(this);
        colleague2 = new ConcreteColleague2(this);
        colleagues = new ArrayList<>();
        colleagues.add(colleague1);
        colleagues.add(colleague2);
    }

    @Override
    public void notify(Colleague colleague) {
        colleague.doTask();        
    }

    public void assignTask1() {
        System.out.println("Direct ping colleague 1");
        colleague1.doTask();
    }
    
    public void assignTask2() {
        System.out.println("Direct ping colleague 2");
        colleague2.doTask();
    }

    public void assignTaskToAll() {
        System.out.println("Ask to all colleague");
        for (Colleague colleague : colleagues) {
            notify(colleague);
        }
    }
}
