package geometry.polygons;

public class Triangle {
    double base;
    double height = 0;
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
        return base + firstArm + secondArm;
    }

    public double getArea() {
        if (height > 0) {
            return base*height/2;
        } else {
            double p = getPerimeter() / 2;

            return Math.sqrt(p*(p-base)*(p-firstArm)*(p-secondArm));
        }
    }
}
