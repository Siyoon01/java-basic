package practice.oop.oopEx1;

public class Rectangle {
    int width;
    int height;
    int area;
    int calculateArea() {
        return width * height;
    }
    int calculatePerimeter() {
        return 2 * (width + height);
    }
    boolean isSquare() {
        return this.width == this.height;
    }
}
