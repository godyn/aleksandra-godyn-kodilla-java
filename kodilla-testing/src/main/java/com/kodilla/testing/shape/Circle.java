package com.kodilla.testing.shape;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void getShapeName(){
        System.out.println("Circle");
    }
    public void getField(){
        System.out.println("It's field equals "+ (radius*radius*3.14));
    }
}
