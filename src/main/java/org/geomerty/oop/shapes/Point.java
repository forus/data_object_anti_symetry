package org.geomerty.oop.shapes;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point b) {
        return Math.abs(Math.sqrt(Math.pow((b.x - this.x), 2) + Math.pow((b.y - this.y), 2)));
    }
}
