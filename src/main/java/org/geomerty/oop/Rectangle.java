package org.geomerty.oop;

public class Rectangle extends Shape{

    private Point pointTopLeft;
    private double width;
    private double height;

    public Rectangle(Point point,double width, double height) {
        super(point);
        this.pointTopLeft = point;
        this.height = height;
        this.width = width;
    }

    public void getArea(){
        double area = this.width*this.height;
        System.out.printf("The area of this rectangle is: %f \n",area);
    }
}


