package org.geomerty.oop.shapes;

public class Rectangle extends Shape {

    private final double width;
    private final double height;
    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double calculateRectangleArea ( ) {
        return width * height;
    }
}
