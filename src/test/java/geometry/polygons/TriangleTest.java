package geometry.polygons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle(9, 12, 15);
    }

    @Test
    void getPerimeter() {
        double expected = 36;
        double actual = triangle.getPerimeter();
        assertEquals(expected, actual);
    }

    @Test
    void getArea() {
        double expected = 54;
        double actual = triangle.getArea();
        assertEquals(expected, actual);
    }
}