package org.geomerty.oop;

public class Traingle extends Shape{

    Point pointTriangle;
    double height;
    double width;

    public Traingle(Point pointTriangle, double height, double width) {
        super(pointTriangle);
        this.pointTriangle = pointTriangle;
        this.height = height;
        this.width = width;
    }

    @Override
    public void getArea() {
        double area = 0.5*height*width;
        System.out.printf("The area of this triangle is: %f", area);

    }
}
