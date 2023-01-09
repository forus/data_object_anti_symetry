package org.geomerty.oop;

import org.geomerty.oop.shapes.Circle;
import org.geomerty.oop.shapes.Rectangle;
import org.geomerty.oop.shapes.Square;
import org.geomerty.oop.shapes.Triangle;

public class Geometry {

    public static void main(String[] args) {
        // TODO Implement calculation of square area using oop code. Top left: x = 2.5, y = 4.5; side = 3.0
        Square square = new Square(3);
        System.out.println("Area of square is " + square.getArea());
        System.out.println("Perimeter of square is " + square.getPerimeter());

        // TODO Implement calculation of rectangle area using oop code. Top left: x = 10.0, y = 5.0; height = 4.0, width = 5.0;
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Area of rectangle is " + rectangle.getArea());
        System.out.println("Perimeter of rectangle is " + rectangle.getPerimeter());

        // TODO Implement calculation of circle area using oop code. Center: x = 8.7, y = 4.0; radius = 6.3;
        Circle circle = new Circle(6.3);
        System.out.println("Area of circle is " + circle.getArea());
        System.out.println("Perimeter of circle is " + circle.getPerimeter());

        Triangle triangle = new Triangle(10, 10, 10);
        System.out.println("Area of triangle is " + triangle.getArea());
        System.out.println("Perimeter of triangle is " + triangle.getPerimeter());
    }
}
