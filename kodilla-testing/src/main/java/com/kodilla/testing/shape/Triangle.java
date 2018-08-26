package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    String name;
    double field;

    public Triangle(double field) {
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return "triangle";
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
