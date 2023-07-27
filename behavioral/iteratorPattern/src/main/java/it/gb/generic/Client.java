package it.gb.generic;

public abstract class Client {
    
    public static void executeGeneric() {
        // Configuration - numeric values
        Short[] shortArray = new Short[]{Short.MIN_VALUE, 100, 10005, 8474, 3945, Short.MAX_VALUE};

        // SImple Short List
        ShortList sl = new ShortList(shortArray);
        while(sl.iterator().hasNext()) {
            System.out.println(sl.iterator().next());
        }
    }
    
}
