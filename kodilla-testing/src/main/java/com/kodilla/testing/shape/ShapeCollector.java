package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> lstFigures = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        lstFigures.add(shape);
    }

    public void removeFigure(Shape shape){
        lstFigures.remove(shape);
    }

    public Shape getFigure(int n){
        return lstFigures.get(n);
    }

    public void showFigures(){
        int n = 0;
        for(Shape s : lstFigures){
            System.out.println("Figura #"+n+" to "+s.getShapeName()+" o powierzchni "+s.getField());
            n++;
        }
    }

    public int getFiguresCount(){
        return lstFigures.size();
    }

}
