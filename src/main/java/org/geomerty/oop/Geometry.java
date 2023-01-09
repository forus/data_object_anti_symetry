package org.geomerty.oop;

public class Geometry {

    public static void main(String[] args) {
        // TODO Implement calculation of square area using oop code. Top left: x = 2.5, y = 4.5; side = 3.0
        Point pointTopLeftSquare = new Point(2.5,4.5);
        Shape square = new Square(pointTopLeftSquare,3);
        square.getArea();
        // TODO Implement calculation of rectangle area using oop code. Top left: x = 10.0, y = 5.0; height = 4.0, width = 5.0;
        Point pointTopLeftRectangle = new Point(10,5);
        Shape rectangle = new Rectangle(pointTopLeftRectangle,5.0,4.0);
        rectangle.getArea();
        // TODO Implement calculation of circle area using oop code. Center: x = 8.7, y = 4.0; radius = 6.3;
        Point centerCircle = new Point(8.7,4);
        Shape circle = new Circle(centerCircle,6.3);
        circle.getArea();

    }
}
