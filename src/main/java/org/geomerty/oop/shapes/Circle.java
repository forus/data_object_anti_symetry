package org.geomerty.oop.shapes;

import org.geomerty.oop.Geometry;

import static java.lang.Math.PI;

public class Circle extends Geometry {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * this.radius * this.radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}
