package org.geomerty.oop;

import org.geomerty.oop.shapes.Circle;
import org.geomerty.oop.shapes.Rectangle;
import org.geomerty.oop.shapes.Point;
import org.geomerty.oop.shapes.Square;

public class Geometry {

    public static void main(String[] args) {
        Point squareTopLeftPoint = new Point(2.5, 4.5);
        Square square = new Square(squareTopLeftPoint, 3.0, 3.0);
        System.out.println("Area of square is " + square.area());
        System.out.println("Perimeter of square is " + square.perimeter());

        Point rectangleTopLeftPoint = new Point(10.0, 5.0);
        Rectangle rectangle = new Rectangle(rectangleTopLeftPoint, 4.0, 5.0);
        System.out.println("Area of rectangle is " + rectangle.area());
        System.out.println("Perimeter of rectangle is " + rectangle.perimeter());

        Point circleCenter = new Point(8.7, 4.0);
        Circle circle = new Circle(circleCenter, 6.3);
        System.out.println("Area of circle is " + circle.area());
        System.out.println("Perimeter of circle is " + circle.perimeter());

    }
}
