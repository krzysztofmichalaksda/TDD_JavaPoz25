package calc.arithmetic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import personal.person.Pesel;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    void calculateBudgetPositive() {
        double expectedValue = 366;
        double budget = 1000;
        Double[] costs = {100.0, 300.0, 234.0};
        double actual = 0;
        try {
            actual = Subtraction.calculateBudget(budget, Arrays.asList(costs));
        } catch (Exception ex) {
            Assertions.fail("Incorrect input data in test");
        }
        assertEquals(expectedValue, actual);
    }

    @Test
    void calculateBudgetFirstIsNegative() {
        double budget = -1000;
        Double[] costs = {100.0, 300.0, 234.0};

        assertThatExceptionOfType(Exception.class)
                .isThrownBy(() -> Subtraction.calculateBudget(budget, Arrays.asList(costs)));
    }

    @Test
    void calculateBudgetCostsHaveNegative() {
        double budget = 1000;
        Double[] costs = {-100.0, 300.0, 234.0};

        assertThatExceptionOfType(Exception.class)
                .isThrownBy(() -> Subtraction.calculateBudget(budget, Arrays.asList(costs)));
    }
}