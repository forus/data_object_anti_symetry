package org.geomerty.oop.shapes;

import static java.lang.Math.PI;

public class Circle {
    private Point center;
    private double radius;

    public double area() {
        return PI*radius*radius;
    }
}
