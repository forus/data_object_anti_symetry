package org.geomerty.oop.shapes;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private final double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.x = x;
        this.radius = radius;
    }
    @Override
    public double calculateArea ( ) {
        return PI * radius * radius;
    }
    @Override
    public double calculateParimeter() {
        return 2 * PI * radius;
    }
}
