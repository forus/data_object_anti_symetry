package org.geomerty.oop.shapes;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 2 * (side + side);
    }
}
