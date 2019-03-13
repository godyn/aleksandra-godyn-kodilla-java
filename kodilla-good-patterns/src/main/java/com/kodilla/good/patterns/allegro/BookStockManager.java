package com.kodilla.good.patterns.allegro;

public class BookStockManager implements StockManager {

    @Override
    public void decreaseStock(ProductId productId, int quantity) {
        System.out.println("\nStock has changed in category "+ productId.getProductCategory() +
                ", position " + productId.getProductID() +"\n" + quantity + " item decreased");
    }
}
