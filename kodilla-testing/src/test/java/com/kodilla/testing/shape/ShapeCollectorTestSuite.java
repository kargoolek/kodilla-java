package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    ShapeCollector shapes = new ShapeCollector();

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Test suite started!");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests ended!");
    }

    @Before
    public void beforeEveryTest() {
        System.out.println("Executing next test...");
        addExampleFigures();
    }

    @Before
    public void afterEveryTest() {
        System.out.println("Test ended.");
    }

    @Test
    public void testFigureAdding() {
        //then
        Assert.assertEquals(3, shapes.getFiguresCount());
    }

    @Test
    public void testFigureInfoDisplaying() {
        String name;
        double field;

        for (int i = 0; i < shapes.getFiguresCount(); i++) {
            //when
            name = shapes.getFigure(i).getShapeName();
            field = shapes.getFigure(i).getField();

            //then
            Assert.assertTrue(name.equals("circle") || name.equals("square") || name.equals("triangle"));
            Assert.assertTrue(field > 0);
        }
    }

    @Test
    public void testFigureRemoving() {
        int intEntryCount = shapes.getFiguresCount();

        //given - static 'shapes'

        //when
        Shape shapeToRemove = shapes.getFigure(0);
        shapes.removeFigure(shapeToRemove);

        //then
        Assert.assertTrue(shapes.getFiguresCount() == intEntryCount - 1);
    }

    private void addExampleFigures(){
        //given
        Square square = new Square(11.12);
        Circle circle = new Circle(11.12);
        Triangle triangle = new Triangle(11.12);

        //when
        shapes.addFigure(square);
        shapes.addFigure(circle);
        shapes.addFigure(triangle);
    }

}