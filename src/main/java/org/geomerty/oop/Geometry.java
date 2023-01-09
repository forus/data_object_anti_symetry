package org.geomerty.oop;

import org.geomerty.oop.shapes.Point;
import org.geomerty.oop.shapes.Square;
import org.geomerty.oop.shapes.Circle;
import org.geomerty.oop.shapes.Rectangle;

public abstract class Geometry {
    public static void main(String[] args) {
        // Implement calculation of square area using oop code. Top left: x = 2.5, y = 4.5; side = 3.0
        Point squareTopLeftPoint = new Point(2.5, 4.5);
        Square square = new Square(squareTopLeftPoint, 3);
        System.out.println("Area of square is " + square.area());

        //Implement calculation of rectangle area using oop code. Top left: x = 10.0, y = 5.0; height = 4.0, width = 5.0
        Point rectangleTopLeftPoint = new Point(10, 5);
        Rectangle rectangle = new Rectangle(rectangleTopLeftPoint, 4, 5);
        System.out.println("Area of rectangle is " + rectangle.area());

        //Implement calculation of circle area using oop code. Center: x = 8.7, y = 4.0; radius = 6.3
        Point circleCenter = new Point(8.7, 4);
        Circle circle = new Circle(circleCenter, 6.3);
        System.out.println("Area of circle is " + circle.area());
    }

    public abstract double area();
}
