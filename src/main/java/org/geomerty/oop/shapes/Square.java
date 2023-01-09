package org.geomerty.oop.shapes;

import org.geomerty.oop.Geometry;

public class Square extends Geometry {
    private Point topLeft;
    private double side;

    public Square(Point topLeft, double side) {
        this.topLeft = topLeft;
        this.side = side;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return this.side * this.side;
    }
}
