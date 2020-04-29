package com.kodilla.abstracts.homework.shape;

public class Circle extends Shape {

    private int r;

    public Circle (int r) {

        this.r = r;
    }

    @Override
    public void calcSurfaceArea() {
        surfaceArea = Math.PI * r *r;
    }

    @Override
    public void calcPerimeter() {
        perimeter = 2 * Math.PI * r;
    }
}
