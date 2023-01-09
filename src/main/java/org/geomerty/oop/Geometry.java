package org.geomerty.oop;

import org.geomerty.oop.shapes.Circle;
import org.geomerty.oop.shapes.Rectangle;
import org.geomerty.oop.shapes.Square;

public class Geometry {

    public static void main(String[] args) {
        // TODO Implement calculation of square area using oop code. Top left: x = 2.5, y = 4.5; side = 3.0
        Square square1 = new Square(2.5, 4.5, 3.0);
        System.out.println("Area of square is " + square1.calculateSquareArea());
        // TODO Implement calculation of rectangle area using oop code. Top left: x = 10.0, y = 5.0; height = 4.0, width = 5.0;
        Rectangle rectangle1 = new Rectangle(10.0, 5.0, 4.0, 4.0);
        System.out.println("Area of rectangle is " + rectangle1.calculateRectangleArea());
        // TODO Implement calculation of circle area using oop code. Center: x = 8.7, y = 4.0; radius = 6.3;
        Circle circle1 = new Circle(8.7, 4.0, 6.3);
        System.out.println("Area of circle is " + circle1.calculateCircleArea());
    }
}
