package org.geomerty.oop.shapes;

public class Square implements iShape{
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("Area of square is " + side * side);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of square is " + 4 * side);
    }
}
