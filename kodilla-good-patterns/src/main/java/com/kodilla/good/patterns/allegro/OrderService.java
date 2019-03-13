package com.kodilla.good.patterns.allegro;

public interface OrderService {

    public boolean order(User user, ProductId productId, int quantity);
}
