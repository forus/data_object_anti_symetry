package org.geomerty.oop.shapes;

public class Square {
    private final Point topLeft;
    private final double side;

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

    public double area() {
        return getSide() * getSide();
    }

    public double perimeter() {
        return 2 * (getSide() + getSide());
    }
}
