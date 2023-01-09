package org.geomerty.oop.shapes;

public class Rectangle extends Shape{
    public Point topLeft;
    public double height;
    public double width;


    public Rectangle(Point topLeft, double height, double width) {
        super(topLeft);
        this.height = height;
        this.width = width;
    }

}
