package org.geomerty.procedural.shapes;

public class Circle extends Shape {
    public Point center;
    public double radius;

    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }

}
