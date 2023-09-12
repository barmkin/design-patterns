package it.gb.generic;

import java.time.LocalDate;

public interface BuilderInterface {

    public BuilderInterface buildBaseProduct(int productId, String productName);

    public BuilderInterface addDescription(String productDescription);

    public BuilderInterface setExpirationDate(LocalDate expirationDate);

    public BuilderInterface addPriceTag(float price);

}
