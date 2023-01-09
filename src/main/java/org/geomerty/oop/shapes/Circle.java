package org.geomerty.oop.shapes;

import static java.lang.Math.PI;

public class Circle implements iShape {
    private final Point center;
    private final double radius;

    public Circle(double centerX, double centerY, double radius) {
        this.center = new Point(centerX, centerY);
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of circle is " + PI * radius * radius);
    }
}
