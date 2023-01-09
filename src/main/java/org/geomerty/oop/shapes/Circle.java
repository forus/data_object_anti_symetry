package org.geomerty.oop.shapes;

import static java.lang.Math.PI;

public class Circle extends Point {
    private final double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.x = x;
        this.radius = radius;
    }

    public double calculateCircleArea ( ) {
        return PI * radius * radius;
    }
}