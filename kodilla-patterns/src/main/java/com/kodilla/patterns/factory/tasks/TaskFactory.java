package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPING : return new ShoppingTask("Lidl", "vegetables", 5);
            case PAINTING : return new PaintingTask("ChildRoom", "blue", "all walls");
            case DRIVING: return new DrivingTask("Pizza", "PizzaHut", "bike");
            default: return null;
        }
    }
}
