package it.gb.generic;

import java.time.LocalDate;

public class Product {

    private int productId;
    private String productName;
    private String productDescription;
    private boolean expires;
    private LocalDate expirationDate;
    private float price;

    public Product(ConcreteBuilder builder) {
        this.expirationDate = builder.getExpirationDate();
        this.expires = builder.isExpires();
        this.price = builder.getPrice();
        this.productDescription = builder.getProductDescription();
        this.productId = builder.getProductId();
        this.productName = builder.getProductName();
    }

    public int getProductId() {
        return this.productId;
    }
 
    public String getProductName() {
        return this.productName;
    }
    
    public String getProductDescription() {
        return this.productDescription;
    }
    
    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }
    
    public boolean hasExpiration() {
        return this.expires;
    }
    
    public float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Product [" + this.getProductName() + "]\n" +
            "\tID: " + this.getProductId() +
            "\n\tPrice: " + this.getPrice() +
            "\n\tDescription: " + this.getProductDescription() +
            "\n\tExpiration Date: " + (this.hasExpiration() ? this.getExpirationDate() : "NONE" );
    }   

}
