package org.geomerty.oop.shapes;

import static java.lang.Math.PI;

public class Circle implements iShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of circle is " + PI * radius * radius);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of circle is " + 2 * PI * radius);
    }
}
