package it.gb.zooAnimals;

public class Lion implements Animal {

    private String name;

    public Lion() {
        super();
        this.name = "Lion (Panthera leo)";
    }

    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    
}
