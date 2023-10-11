package org.geomerty.oop.shapes;

public class Rectangle  extends Point{
    public double height;
    public double width;

    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public double area(){
        return height * width;
    }
}
