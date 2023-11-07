package it.gb.generic;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    private void extra() {
        System.out.println("[ConcreteDecorator] extra()");
    }

    @Override
    public void execute() {
       super.execute();
       System.out.println("[ConcreteDecorator] execute()");
       this.extra();
    }
    
}
