package com.kodilla.patterns2.facade.api;

public class ItemDto {

    private final Long productId;
    private final double quantity;

    public ItemDto (final Long productId, final double qty){
        this.productId=productId;
        this.quantity=qty;
    }


    public Long getProductId() {
        return productId;
    }

    public double getQuantity() {
        return quantity;
    }
}
