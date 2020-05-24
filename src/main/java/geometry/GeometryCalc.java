package geometry;

import geometry.polygons.Rectangle;
import geometry.polygons.Square;
import geometry.polygons.Triangle;

public class GeometryCalc {
    public static void main(String[] args) {
        double squareSide = 7;
        Square square1 = new Square(squareSide);
        double area = square1.getArea();
        System.out.println("Pole kwadratu o boku " + squareSide +
                " wynosi: " + area
        );

        double a = 56;
        double b = 93;
        Rectangle rectangle1 = new Rectangle(a, b);
        System.out.println("Obwód prostokątu o bokach " + a + " i " + b +
                " wynosi: " + rectangle1.getPerimeter()
        );

        double base = 984;
        double height = 567;
        Triangle triangle1 = new Triangle(base, height);
        System.out.println("Pole trójkąta o podstawie " + base + " i wysokości " + height +
                " wynosi: " + triangle1.getArea()
        );
    }
}
