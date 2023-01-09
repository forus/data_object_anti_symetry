package org.geomerty.oop.shapes;

public class Triangle extends Shape{
    public Point topleft;
    public double a;
    public double b;
    public double c;

    public Triangle(Point topleft, double a, double b, double c){
        super(topleft);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
