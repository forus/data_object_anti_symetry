package org.geomerty.procedural.shapes;

public class Square extends Shape{
    public Point topLeft;
    public double side;

    public Square(Point topLeft, double side){
        super(topLeft);
        this.side = side;
    }


}
