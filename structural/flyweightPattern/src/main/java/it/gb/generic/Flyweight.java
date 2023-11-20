package it.gb.generic;

public class Flyweight {

    // Repeating INTRINSIC State, shared across objects
    private String repeatingStringHeader;
    private String repeatingStringFooter;

    public Flyweight(String repeatingStringHeader, String repeatingStringFooter) {
        this.repeatingStringHeader = repeatingStringHeader;
        this.repeatingStringFooter = repeatingStringFooter;
    }

    protected String getRepeatingStringHeader() {
        return repeatingStringHeader;
    }

    protected String getRepeatingStringFooter() {
        return repeatingStringFooter;
    }

    // Example of operation(uniqueState)
    public String printAllContents(String contentA, String contentB) {

        StringBuilder contentBuilder = new StringBuilder();

        contentBuilder.append("\n");
        contentBuilder.append(this.repeatingStringHeader + " [#" + System.identityHashCode(this.repeatingStringHeader) + "]");
        contentBuilder.append("\n");
        contentBuilder.append(contentA);
        contentBuilder.append("\n");
        contentBuilder.append(contentB);
        contentBuilder.append("\n");
        contentBuilder.append(this.repeatingStringFooter + " [#" + System.identityHashCode(this.repeatingStringFooter) + "]");

        return contentBuilder.toString();
    }
}
