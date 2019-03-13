package com.kodilla.good.patterns.allegro;

public class OrderRequest {

    private User user;
    private ProductId productId;
    private int quantity;

    public OrderRequest(User user, ProductId productId, int quantity) {
        this.user = user;
        this.productId = productId;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public ProductId getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}
