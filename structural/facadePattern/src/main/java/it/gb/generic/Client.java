package it.gb.generic;

public abstract class Client {

  public static void executeGeneric() {

    // Create facade to simplify subSistem1 interaction
    Facade facade = new Facade();    

    // Simply use method exposed by facade
    facade.executeObject1OnServer("127.0.0.1", 8080);
  }

}
