package Abstractions;

public class Rectangle extends Shape implements TwoDimensional {

    private double a;
    private double b;

    public Rectangle(int verticesCout, double a, double b) {
        super(verticesCout);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public boolean askForDimensional() {
        return Rectangle.isTwoDimensional;
    }
}