package it.gb.zooAnimals;

public class Researcher implements AnimalVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println("[Researcher] Conducting research about " + animal.getName());
        this.observeBehavior(animal);
    }

    @Override
    public void feedAnimal(Animal animal) {
        System.out.println("[Researcher] Better call a Zookeeper to feed " + animal.getName());
    }

    @Override
    public void cleanHabitat(Animal animal) {
        System.out.println("[Researcher] Better call a Zookeeper to clean habitat of " + animal.getName());
    }

    @Override
    public void observeBehavior(Animal animal) {
        System.out.println("[Researcher] I'm studying the behavior of " + animal.getName());
    }

}
