package com.kodilla.abstracts.homework.shape;

public abstract class Shape {

    public double surfaceArea;
    public double perimeter;

    public abstract void calcSurfaceArea();

    public abstract void calcPerimeter();

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
