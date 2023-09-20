package it.gb.generic;

public class ConcretePrototype implements Prototype<ConcretePrototype> {

    private int id;
    private String name;
    private int timeoutInSeconds;
    private String size;
    private boolean hasColor;
    private boolean hasCombo;

    public ConcretePrototype() {
        super();
        this.hasColor = false;
        this.hasCombo = false;
        this.id = 0;
        this.name = "Concrete Prototype v. 0.1.0";
        this.size = "DEFAULT";
        this.timeoutInSeconds = 60;
    }

    public ConcretePrototype(ConcretePrototype prototype) {
        super();
        this.hasColor = prototype.isHasColor();
        this.hasCombo = prototype.isHasCombo();
        this.id = prototype.getId();
        this.name = prototype.getName();
        this.size = prototype.getSize();
        this.timeoutInSeconds = prototype.getTimeoutInSeconds();
    }

    @Override
    public ConcretePrototype clonePrototype() {
        return new ConcretePrototype(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    public void setTimeoutInSeconds(int timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isHasColor() {
        return hasColor;
    }

    public void setHasColor(boolean hasColor) {
        this.hasColor = hasColor;
    }

    public boolean isHasCombo() {
        return hasCombo;
    }

    public void setHasCombo(boolean hasCombo) {
        this.hasCombo = hasCombo;
    }

    @Override
    public String toString() {
        return "ConcretePrototype [id=" + id + ", name=" + name + ", timeoutInSeconds=" + timeoutInSeconds + ", size="
                + size + ", hasColor=" + hasColor + ", hasCombo=" + hasCombo + "]";
    }
    
}
