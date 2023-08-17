package it.gb.zooAnimals;

public interface Animal {

    public String getName();
    
    public void accept(AnimalVisitor visitor);

}
