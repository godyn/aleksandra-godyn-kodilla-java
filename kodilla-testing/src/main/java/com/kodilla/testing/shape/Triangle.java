package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double base;
    private double high;

    public Triangle(double base, double high) {
        this.base = base;
        this.high = high;
    }

    public double getBase() {
        return base;
    }

    public double getHigh() {
        return high;
    }

    public void getShapeName(){
        System.out.println("Triangle");
    }
    public void getField(){
        System.out.println("It's field equals "+ (base*high*0.5));
    }
}
