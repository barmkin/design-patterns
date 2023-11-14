package it.gb.generic.subSystem1;

public abstract class Object1Player {
    
    public static void executeMethod1(Object1 obj) {
        System.out.println("Execute method1 on connected " + obj.getId() + " | " + obj.getServerName() + ":" + obj.getServerPort());
    }
}
