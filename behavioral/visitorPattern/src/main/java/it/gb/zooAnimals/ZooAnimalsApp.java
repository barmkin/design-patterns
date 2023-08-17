package it.gb.zooAnimals;

import java.util.ArrayList;
import java.util.List;

public abstract class ZooAnimalsApp {
    
    public static void executeZooAnimalsApp() {
        System.out.println("Zoo Animals App");

        // Create a zoo
        List<Animal> zoo = new ArrayList<Animal>();

        // Add a Zookeeper
        Zookeeper zookeeper = new Zookeeper();

        // Add Animals
        zoo.add(new Lion());
        zoo.add(new Elephant());
        zoo.add(new Monkey());
        
        // Add a Reasearcher
        Researcher researcher = new Researcher();

        // Zookeper routine
        for (Animal animal : zoo) {
            zookeeper.visit(animal);
        }

        // Researrcher routine
        for (Animal animal : zoo) {
            researcher.visit(animal);
        }

    }

}
