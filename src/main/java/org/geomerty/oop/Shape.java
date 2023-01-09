package org.geomerty.oop;


public abstract class Shape {
    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public abstract void getArea();
}
