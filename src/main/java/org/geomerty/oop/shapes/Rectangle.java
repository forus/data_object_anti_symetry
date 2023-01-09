package org.geomerty.oop.shapes;

public class Rectangle implements iShape {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle is " + height * width);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of rectangle is " + 2 * (height + width));
    }
}
