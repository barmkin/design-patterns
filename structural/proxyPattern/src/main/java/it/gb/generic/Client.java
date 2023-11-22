package it.gb.generic;

public abstract class Client {

  public static void executeGeneric() {
    // Create a proxy to service/subject
    RealSubject realSubject = new RealSubject();
    Proxy subjectProxy = new Proxy(realSubject);

    // Invoke operation via proxy
    subjectProxy.operation();
    
  }

}
