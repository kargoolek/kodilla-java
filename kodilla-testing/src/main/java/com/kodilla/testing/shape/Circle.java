package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    double field;

    public Circle(double field) {
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.field, field) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}
