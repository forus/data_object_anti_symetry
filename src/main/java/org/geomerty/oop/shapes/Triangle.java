package org.geomerty.oop.shapes;

public class Triangle implements iShape{
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("Area of triangle is " + 0.5 * base * height);
    }

    @Override
    public void perimeter() { //Only works for 90 degree triangles.
        double hypotenuse = Math.sqrt((base * base) + (height * height));
        System.out.println("perimeter of triangle is " + (base + height + hypotenuse));
    }
}
