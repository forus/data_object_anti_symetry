package org.geomerty.oop.shapes;

import static java.lang.Math.PI;

public class Circle {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public double area() {
        return PI * getRadius() * getRadius();
    }

    public double perimeter() {
        return 2 * PI * getRadius();
    }
}
