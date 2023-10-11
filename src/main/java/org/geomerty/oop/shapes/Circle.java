package org.geomerty.oop.shapes;

public class Circle extends Point{
    public double radius;

    public Circle(double x, double y,double radius) {
        super(x,y);
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
