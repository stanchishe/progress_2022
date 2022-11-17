package Abstractions;

public class Abstractions {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 5);
        circle.getVerticesCount();
        circle.calculateArea();

        Rectangle rectangle = new Rectangle(4, 5, 4.4);
        rectangle.getVerticesCount();
        rectangle.calculateArea();
    }
}