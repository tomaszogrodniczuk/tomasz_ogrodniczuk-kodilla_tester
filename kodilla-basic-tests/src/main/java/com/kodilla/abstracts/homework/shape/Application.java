package com.kodilla.abstracts.homework.shape;

public class Application {

    public static void main (String[] args)    {

        Circle circle = new Circle(5);
        circle.calcSurfaceArea();
        circle.calcPerimeter();
        System.out.format("Surface of circle: %.2f%n", circle.getSurfaceArea());
        System.out.format("Perimeter of circle: %.2f%n", circle.getPerimeter());

        Square square = new Square(4);
        square.calcSurfaceArea();
        square.calcPerimeter();
        System.out.format("Surface of square: %.2f%n", square.getSurfaceArea());
        System.out.format("Perimeter of square: %.2f%n", square.getPerimeter());

        Rectangle rectangle = new Rectangle(2,3);
        rectangle.calcSurfaceArea();
        rectangle.calcPerimeter();
        System.out.format("Surface of rectangle: %.2f%n", rectangle.getSurfaceArea());
        System.out.format("Perimeter of rectangle: %.2f%n", rectangle.getPerimeter());
    }
}
