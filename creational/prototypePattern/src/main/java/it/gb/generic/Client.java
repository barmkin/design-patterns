package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {

      // Init
      ConcretePrototype originalProtoype = new ConcretePrototype();

      // Create Replicas
      ConcretePrototype replica1 = originalProtoype.clonePrototype();
      replica1.setId(1);
      replica1.setHasColor(true);
      replica1.setSize("LARGE");

      ConcretePrototype replica2 = originalProtoype.clonePrototype();
      replica2.setId(2);

      ConcretePrototype replica3 = replica1.clonePrototype();
      replica3.setId(3);
      replica3.setName("Clone of Replica 1");

      // Print
      System.out.println(originalProtoype);
      System.out.println(replica1);
      System.out.println(replica2);
      System.out.println(replica3);

    }

}
