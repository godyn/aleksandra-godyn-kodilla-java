package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        Square square = new Square(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapeCollector().size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Circle circle = new Circle(2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapeCollector().size());
    }
    @Test
    public void testRemoveFigureNotExisting(){
        //Given
        Circle circle = new Circle(2);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure(){
        //Given
        Circle circle = new Circle(2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, result);
    }
}
