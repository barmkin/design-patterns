package it.gb.generic;

public class Context {

    // Unique EXTRINSIC State, unique across original objects
    private String contentA;
    private String contentB;
    // INTRINSIC State
    private Flyweight flyweight;

    public Context(String repeatingStringHeader, String repeatingStringFooter,
            String contentA, String contentB,
            FlyweightFactory factory) {
        this.contentA = contentA;
        this.contentB = contentB;
        this.flyweight = factory.getFlyweight(repeatingStringHeader, repeatingStringFooter);
    }

    public String getContentA() {
        return this.contentA;
    }

    public String getContentB() {
        return this.contentB;
    }

    public String getRepeatingStringHeader() {
        return this.flyweight.getRepeatingStringHeader();
    }

    public String getRepeatingStringFooter() {
        return this.flyweight.getRepeatingStringFooter();
    }

    public String printAllContents() {
        return this.flyweight.printAllContents(this.contentA, this.contentB);
    }

}
