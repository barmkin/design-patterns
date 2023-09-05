package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setSharedString("Test1");

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("[singleton2] Shared string is " + singleton2.getSharedString());

        singleton2.setSharedString("Test2");

        System.out.println("[singleton1] Shared string is " + singleton1.getSharedString());
        System.out.println("[singleton2] Shared string is " + singleton2.getSharedString());

    }

}
