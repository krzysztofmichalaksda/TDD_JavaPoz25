package geometry.polygons;

public class Square {
    double base;

    public Square() {
        base = 1;
    }

    public Square(double base) {
        this.base = base;
    }

    public double getPerimeter() {
        return 2*base;
    }

    public double getArea() {
        return base*base;
    }
}
