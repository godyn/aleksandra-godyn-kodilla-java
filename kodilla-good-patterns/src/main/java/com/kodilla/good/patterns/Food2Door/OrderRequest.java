package com.kodilla.good.patterns.Food2Door;

public class OrderRequest {

    String product;
    int quantity;
    User user;

    public OrderRequest(String product, int quantity, User user) {
        this.product = product;
        this.quantity = quantity;
        this.user = user;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public User getUser() {
        return user;
    }
}
