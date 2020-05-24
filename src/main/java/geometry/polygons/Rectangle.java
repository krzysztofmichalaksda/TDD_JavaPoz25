package geometry.polygons;

public class Rectangle {
    double base;
    double height;

    public Rectangle() {
        base = 1;
        height = 1;
    }

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getPerimeter() {
        return 2*base + 2*height;
    }

    public double getArea() {
        return base*height;
    }
}
