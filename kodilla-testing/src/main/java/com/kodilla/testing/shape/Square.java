package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideLenght;

    public Square( double sideLenght) {

        this.sideLenght = sideLenght;
    }

    @Override
    public void getShapeName() {
        System.out.println("Square");
    }

    @Override
    public void getField() {
        System.out.println("It's field equals "+ (sideLenght*sideLenght));
    }

    public double getSideLenght() {
        return sideLenght;
    }
}
