package org.geomerty.oop.shapes;

public class Square extends Point{
    public double side;

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    public double perimeter(){
        return 4 * side;
    }
}
