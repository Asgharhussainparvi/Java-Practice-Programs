package ThisKeyword;

public class Rectangle {
    public int width;
    public int height;

    // constructor
    public Rectangle(int width, int height) {

        this.width = width;
        this.height = height;

    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
