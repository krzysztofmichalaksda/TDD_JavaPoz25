package geometry.polygons;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square;

    @BeforeEach
    void setUp() {
        square = new Square(3);
    }

    @Test
    void getPerimeter() {
        double expectedPerimeter = 12;
        double actual = square.getPerimeter();
        assertEquals(expectedPerimeter, actual);
    }

    @Test
    void getArea() {
        double expectedArea = 9;
        double actual = square.getArea();
        assertEquals(expectedArea, actual);
    }

    @Test
    void getDiagonal() {
        double expectedDiagonal = 4.243;
        double actual = square.getDiagonal();
        assertThat(actual)
                .isCloseTo(expectedDiagonal, Percentage.withPercentage(1));
    }
}