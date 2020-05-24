package calc.arithmetic;

import java.util.List;

public class Add {
    public static double multiNumber(List<Double> numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static int numbersInterval(int firstEdge, int secondEdge) {
        int sum = 0;
        for (int number = firstEdge; number < secondEdge; number++) {
            sum += number;
        }

        return sum;
    }
}
