package edu.hw2.Task2;

public class Rectangle {
    public final int width;
    public final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public final double area() {
        return width * height;
    }
}
