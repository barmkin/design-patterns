package it.gb.generic;

public abstract class Decorator implements Component {

    private Component wrappee;

    public Decorator(Component component) {
        super();
        this.wrappee = component;
    }

    @Override
    public void execute() {
        this.wrappee.execute();        
    }

    
    
}
