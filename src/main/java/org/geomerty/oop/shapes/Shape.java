package org.geomerty.oop.shapes;

public abstract class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea ();
    public abstract double calculateParimeter ();
}
