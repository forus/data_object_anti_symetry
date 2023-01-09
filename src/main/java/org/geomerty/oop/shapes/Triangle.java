package org.geomerty.oop.shapes;

public class Triangle {
    private Point topLeft;
    private double height;
    private double base;

    public Triangle(Point topLeft, double height, double base) {
        this.topLeft = topLeft;
        this.height = height;
        this.base = base;
    }

    public double area() {
        return (1/2.0)*height*base;
    }

    public double perimeter() {
        return base*3;
    }

}
