package org.geomerty.oop.shapes;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;
    private final double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return 0.5 * getB() * getHeight();
    }

    public double perimeter() {
        return getA() + getB() + getC();
    }
}
