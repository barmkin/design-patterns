package it.gb.zooAnimals;

public class Monkey implements Animal {

    private String name;

    public Monkey() {
        super();
        this.name = "Monkey (Macaca radiata)";
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
