package org.geomerty.procedural.shapes;

public class Rectangle {
    private final Point topLeft;
    private final double height;
    private final double width;

    public Rectangle(Point topLeft, double height, double width){
        this.topLeft = topLeft;
        this.height = height;
        this.width = width;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return getWidth() * getHeight();
    }
}
