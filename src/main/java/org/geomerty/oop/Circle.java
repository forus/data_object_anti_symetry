package org.geomerty.oop;

public class Circle extends Shape {

    private Point center;
    private double radius;

    public Circle (Point center, double radius) {
        super(center);
        this.center = center;
        this.radius = radius;
    }

    public void getArea(){
        double area = Math.PI * (this.radius * this.radius);
        System.out.printf("The area of this circle is: %f \n",area);
    }
}
