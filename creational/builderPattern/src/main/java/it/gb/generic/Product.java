package it.gb.generic;

import java.util.Date;

public class Product extends AbstractProduct {

    public Product(ConcreteBuilder builder) {
        this.expirationDate = builder.expirationDate;
        this.expires = builder.expires;
        this.price = builder.price;
        this.productDescription = builder.productDescription;
        this.productId = builder.productId;
        this.productName = builder.productName;
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
    
    public Date getExpirationDate() {
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
