package com.kodilla.good.patterns.Food2Door;

public class Application {

    public static void main (String[] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrive();

        Food2DoorProcessor food2DoorProcessor1 = new Food2DoorProcessor(new HealthyShop(), new MailService());
        food2DoorProcessor1.placeAnOrder(orderRequest);

        Food2DoorProcessor food2DoorProcessor2 = new Food2DoorProcessor(new GlutenFreeShop(), new MailService());
        food2DoorProcessor2.placeAnOrder(orderRequest);

        Food2DoorProcessor food2DoorProcessor3 = new Food2DoorProcessor(new ExtraFoodShop(), new MailService());
        food2DoorProcessor3.placeAnOrder(orderRequest);

    }
}
