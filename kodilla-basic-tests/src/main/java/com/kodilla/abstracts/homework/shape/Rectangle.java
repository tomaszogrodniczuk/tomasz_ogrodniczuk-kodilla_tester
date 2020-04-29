package com.kodilla.abstracts.homework.shape;

public class Rectangle extends Shape{

    private double a;
    private double b;

    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calcSurfaceArea() {
        surfaceArea = a * b;
    }

    @Override
    public void calcPerimeter() {
        perimeter = 2 * a + 2 * b;
    }
}
