package it.gb.generic;

public abstract class AbstractProduct {
    public String name;
    public int propertyOne;
    public int propertyTwo;
    public String description;
    public String factoryCode;

    public AbstractProduct() {
        super();
        this.propertyOne = 1;
        this.propertyTwo = 2;
    }

    protected void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo
                + ", description=" + description + ", factoryCode=" + factoryCode + "]";
    }
}
