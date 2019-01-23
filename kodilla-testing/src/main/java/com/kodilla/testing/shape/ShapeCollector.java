package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeCollector = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapeCollector.add(shape);
    }

    public Boolean removeFigure(Shape shape){
        boolean result = shapeCollector.remove(shape);
        return result;
    }

    public Shape getFigure(int n){
        return shapeCollector.get(n);
    }

    public ArrayList<Shape> getShapeCollector() {
        return shapeCollector;
    }
}
