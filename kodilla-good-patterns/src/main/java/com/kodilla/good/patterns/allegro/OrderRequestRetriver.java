package com.kodilla.good.patterns.allegro;

public class OrderRequestRetriver {

    public OrderRequest retrive(){
        User user = new User("Anna", "Kowalczyk");
        ProductId productId = new ProductId("books", "b113");
        int quantity = 1;

        return new OrderRequest(user, productId, quantity);
    }
}
