package calc.arithmetic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    void calculateBudgetPositive() {
        double first = 1000;
        Double[] costs = {100.0, 300.0, 234.0};

        double auctal = Subtraction.calculateBudget(first, Arrays.asList(costs));

    }

    @Test
    void calculateBudgetFirstIsNegative() {

    }

    @Test
    void calculateBudgetCostsHaveNegative() {

    }
}