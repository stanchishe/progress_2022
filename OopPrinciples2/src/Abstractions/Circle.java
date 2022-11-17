package Abstractions;

public class Circle extends Shape implements TwoDimensional {
    private double radius;
    private double pi = 3.14159;

    public Circle(int verticesCount, double radius) {
        super(verticesCount);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi * radius * radius;
    }

    @Override
    public boolean askForDimensional() {
        return Circle.isTwoDimensional;
    }
}