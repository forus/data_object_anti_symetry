package org.geomerty.oop.shapes;

public class Square extends Shape {
    private final double side;

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double calculateArea () {
        return side * side;
    }

    @Override
    public double calculateParimeter () {
        return 4 * side;
    }
}
