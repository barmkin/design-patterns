package it.gb.zooAnimals;

public class Zookeeper implements AnimalVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println("[Zookeeper] Preparing food for " + animal.getName());
        this.feedAnimal(animal);
        System.out.println("[Zookeeper] Checking status of the habitat...");
        if (Math.random() > 0.5) {
            this.cleanHabitat(animal);
        } else {
            System.out.println("[Zookeeper] The habitat is clean");
        }
    }

    @Override
    public void feedAnimal(Animal animal) {
        System.out.println("[Zookeeper] Feeding " + animal.getName());
    }

    @Override
    public void cleanHabitat(Animal animal) {
        System.out.println("[Zookeeper] Cleaning habitat of " + animal.getName());
    }

    @Override
    public void observeBehavior(Animal animal) {
        System.out.println("Better call a Researcher to observe behavior of " + animal.getName());
    }

}
