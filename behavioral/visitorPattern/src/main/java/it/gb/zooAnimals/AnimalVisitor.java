package it.gb.zooAnimals;

public interface AnimalVisitor {

    public void visit(Animal animal);
    
    public void feedAnimal(Animal animal);
    public void cleanHabitat(Animal animal);
    public void observeBehavior(Animal animal);

}
