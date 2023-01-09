package org.geomerty.oop;

import org.geomerty.procedural.shapes.Circle;
import org.geomerty.procedural.shapes.Point;
import org.geomerty.procedural.shapes.Rectangle;
import org.geomerty.procedural.shapes.Square;
import org.geomerty.procedural.shapes.Triangle;

public class Geometry {

    public static void main(String[] args) {
        Square square = new Square(new Point(2.5,4.5), 3);
        System.out.println("Area of square is " + square.area());
        System.out.println("Perimeter of square is " + square.perimeter());

        Rectangle rectangle = new Rectangle(new Point(10,5), 4,5);
        System.out.println("Area of rectangle is " + rectangle.area());
        System.out.println("Perimeter of rectangle is " + rectangle.perimeter());

        Circle circle = new Circle(new Point(8.7,4),6.3);
        System.out.println("Area of circle is " + circle.area());
        System.out.println("Perimeter of circle is " + circle.perimeter());

        Triangle triangle = new Triangle(2,5,3,2);
        System.out.println("Area of triangle is " + triangle.area());
        System.out.println("Perimeter of triangle is " + triangle.perimeter());
    }
}
