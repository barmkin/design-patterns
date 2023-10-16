package it.gb.generic;

public abstract class Client {

    private static void printTarget(Target t) {
        System.out.println(t.getName() + " - [" + t.getObjectID() 
            + "] v. " + t.getMajorVersion() + "." + t.getMinorVersion() 
            + "." + t.getPatchVersion()
        );
    }
    
    public static void executeGeneric() {

        // Create a simple target object
        ConcreteTarget target = new ConcreteTarget("Standard Target", "StdTarget#1", 1, 1, 0);
        Client.printTarget(target);

        // Create an 'old-legacy' adaptee object
        Adaptee adaptee1 = new Adaptee("Adaptee 1", "1496");
        // Adapt object to new interface
        Adapter adapter1 = new Adapter(adaptee1);
        Client.printTarget(adapter1);

        // Create a 'legacy' adaptee
        Adaptee adaptee2 = new Adaptee("Adaptee 3000", "3000.485.13");
        Adapter adapter2 = new Adapter(adaptee2);
        Client.printTarget(adapter2);

    }

}
