package it.gb.zooAnimals;

public class Elephant implements Animal {

    private String name;

    public Elephant() {
        super();
        this.name = "Elephant (Loxodonta africana)";
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
