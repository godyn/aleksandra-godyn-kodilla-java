package com.kodilla.good.patterns.Food2Door;

public class OrderRequestRetriever {

    public OrderRequest retrive(){
        String product = "Potatoes";
        int quantity = 5;
        User user1 = new User("AnnaKowalczyk");
        return new OrderRequest(product, quantity, user1);
    }
}
