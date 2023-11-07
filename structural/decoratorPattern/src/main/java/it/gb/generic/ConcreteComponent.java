package it.gb.generic;

public class ConcreteComponent implements Component {

    @Override
    public void execute() {
        System.out.println("[ConcreteComponent] execute()");
    }
    
}
