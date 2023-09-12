package it.gb.generic;

import java.time.LocalDate;

public class ConcreteBuilder implements BuilderInterface {

    private int productId;
    private String productName;
    private String productDescription;
    private boolean expires;
    private LocalDate expirationDate;
    private float price;

    public ConcreteBuilder() {
        super();
    }

    @Override
    public BuilderInterface buildBaseProduct(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
        return this;
    }

    @Override
    public BuilderInterface addDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    @Override
    public BuilderInterface setExpirationDate(LocalDate expirationDate) {
        if (expirationDate != null) {
            this.expires = true;
        } else {
            this.expires = false;
        }
        this.expirationDate = expirationDate;
        return this;
    }

    @Override
    public BuilderInterface addPriceTag(float price) {
        this.price = price;
        return this;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public boolean isExpires() {
        return expires;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public float getPrice() {
        return price;
    }
}
