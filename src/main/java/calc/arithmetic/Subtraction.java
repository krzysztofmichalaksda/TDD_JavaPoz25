package calc.arithmetic;

import java.util.List;

public class Subtraction {
    public static double calculateBudget(double first, List<Double> costs) throws Exception {
        checkValue(first, "Budget");
        double result = first;
        for (Double cost : costs) {
            checkValue(cost, "Cost");
            result -= cost;
        }

        return result;
    }

    private static void checkValue(double value, String name) throws Exception
    {
        if (value < 0) {
            throw new Exception(name + " can not be less than zero: " + value);
        }
    }
}
