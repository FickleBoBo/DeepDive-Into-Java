package oop1.ex;

public class Rectangle {

    int width;
    int height;

    int getArea() {
        return width * height;
    }

    int getPerimeter() {
        return width * 2 + height * 2;
    }

    boolean isSquare() {
        return width == height;
    }
}
