package com.kodilla.abstracts.homework.shape;

public class Square extends Shape{

    private double a;

    public Square (double a) {
        this.a = a;
    }

    @Override
    public void calcSurfaceArea() {
        surfaceArea = a * a;
    }

    @Override
    public void calcPerimeter() {
        perimeter = 4 * a;
    }
}
