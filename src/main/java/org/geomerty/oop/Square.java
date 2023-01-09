package org.geomerty.oop;

public class Square extends Shape{

    private Point pointTopLeft;
    private double side;

    public Square(Point pointTopLeft, double side) {
        super(pointTopLeft);
        this.pointTopLeft = pointTopLeft;
        this.side = side;
    }

    public void getArea(){
        double area = side*side;
        System.out.printf("The area of this square is: %f \n",area);
    }
}
