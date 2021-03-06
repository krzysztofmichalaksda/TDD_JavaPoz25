package geometry.polygons;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @ParameterizedTest()
    @CsvSource({
            "12, 4, 2",
            "200, 60, 40",
            "33, 7.5, 9" })
    void getPerimeterTest(double expected, double a, double b) {
        Rectangle rectangle = new Rectangle(a, b);
        assertEquals(
            expected,
            rectangle.getPerimeter()
        );
    }
}