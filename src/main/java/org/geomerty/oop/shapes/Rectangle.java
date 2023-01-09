package org.geomerty.oop.shapes;

public class Rectangle {
    private Point topLeft;
    private double height;
    private double width;

    public Rectangle(Point topLeft, double height, double width) {
        this.topLeft = topLeft;
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height*width;
    }
}