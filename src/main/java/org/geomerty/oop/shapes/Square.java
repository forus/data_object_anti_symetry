package org.geomerty.oop.shapes;

public class Square extends Point {
    private final double side;

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    public double calculateSquareArea () {
        return side * side;
    }
}