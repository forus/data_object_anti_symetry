package org.geomerty.oop.shapes;

import org.geomerty.oop.Geometry;

public class Rectangle extends Geometry {
    private Point topLeft;
    private double height;
    private double width;

    public Rectangle(Point topLeft, double height, double width) {
        this.topLeft = topLeft;
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return this.height * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
