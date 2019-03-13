package com.kodilla.good.patterns.allegro;

public class ProductId {

    String productCategory;
    String productID;

    public ProductId(String productCategory, String productID) {
        this.productCategory = productCategory;
        this.productID = productID;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductID() {
        return productID;
    }
}
