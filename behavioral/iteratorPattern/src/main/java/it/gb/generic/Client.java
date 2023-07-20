package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric(Short[] shortArray) {
        // SImple Short List
        ShortList sl = new ShortList(shortArray);
        while(sl.iterator().hasNext()) {
            System.out.println(sl.iterator().next());
        }
    }
    
}
