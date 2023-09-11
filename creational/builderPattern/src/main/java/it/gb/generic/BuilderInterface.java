package it.gb.generic;

import java.util.Date;

public interface BuilderInterface {

    public BuilderInterface buildBaseProduct(int productId, String productName);

    public BuilderInterface addDescription(String productDescription);

    public BuilderInterface setExpirationDate(Date expirationDate);

    public BuilderInterface addPriceTag(float price);

}
