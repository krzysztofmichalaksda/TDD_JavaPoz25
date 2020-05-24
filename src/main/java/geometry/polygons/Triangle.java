package geometry.polygons;

public class Triangle {
    double base;
    double height;
    double firstArm;
    double secondArm;

    public Triangle() {
        base = 3;
        height = 4;
        firstArm = 4;
        secondArm = 5;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double arm1, double arm2) {
        this.base = base;
        this.firstArm = arm1;
        this.secondArm = arm2;
    }

    public double getPerimeter() {
        return 2*base + 2*height;
    }

    public double getArea() {
        return base*height/2;
    }
}
