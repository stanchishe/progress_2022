package Abstractions;

public abstract class Shape {
    //Subclasses don't have to have this value set immediately
    int verticesCount;

    public abstract double calculateArea();

    public int getVerticesCount() {
        return verticesCount;
    }

    public Shape(int verticesCount) {
        this.verticesCount = verticesCount;
    }

}
