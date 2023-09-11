package it.gb.generic;

import java.util.Date;

public class ConcreteBuilder
    extends AbstractProduct
    implements BuilderInterface {

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
    public BuilderInterface setExpirationDate(Date expirationDate) {
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
}
