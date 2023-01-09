package org.geomerty.procedural;

import org.geomerty.procedural.shapes.Circle;
import org.geomerty.procedural.shapes.Point;
import org.geomerty.procedural.shapes.Rectangle;
import org.geomerty.procedural.shapes.Square;

import static java.lang.Math.PI;

public class Geometry {
    public static double area(Object shape) throws NoSuchShapeException {
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return s.getSide() * s.getSide();
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.getHeight() * r.getWidth();
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return PI * c.getRadius() * c.getRadius();
        }
        throw new NoSuchShapeException();
    }

    public static double perimeter(Object shape) throws NoSuchShapeException {
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return 2 * (s.getSide() + s.getSide());
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return 2 * (r.getHeight() + r.getWidth());
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return 2 * PI * c.getRadius();
        }
        throw new NoSuchShapeException();
    }

    public static void main(String[] args) throws NoSuchShapeException {
        Point squareTopLeftPoint = new Point(2.5, 4.5);
        Square square = new Square(squareTopLeftPoint, 3);
        System.out.println("Area of square is " + area(square));
        System.out.println("Perimeter of square is " + perimeter(square));


        Rectangle rectangle = new Rectangle(new Point(10, 5), 4, 5);
        System.out.println("Area of rectangle is " + area(rectangle));
        System.out.println("Perimeter of rectangle is " + perimeter(rectangle));

        Circle circle = new Circle(new Point(8.7, 4), 6.3);
        System.out.println("Area of circle is " + area(circle));
        System.out.println("Perimeter of circle is " + perimeter(circle));
    }
}
