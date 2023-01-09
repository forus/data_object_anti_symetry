package org.geomerty.oop.shapes;

import org.geomerty.oop.Geometry;

import static java.lang.Math.sqrt;

public class Triangle extends Geometry {
    private Point orthocenter;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Point orthocenter, double sideA, double sideB, double sideC) {
        this.orthocenter = orthocenter;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public Point getOrthocenter() {
        return orthocenter;
    }

    @Override
    public double area() {
        double s = this.perimeter() / 2;
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
}
