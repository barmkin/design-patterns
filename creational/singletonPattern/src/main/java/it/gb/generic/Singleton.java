package it.gb.generic;

public class Singleton {

    private String sharedString;

    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
        super();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public String getSharedString() {
        return sharedString;
    }

    public void setSharedString(String sharedString) {
        this.sharedString = sharedString;
    }
 
}
