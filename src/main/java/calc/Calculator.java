package calc;

import calc.arithmetic.Add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int mode = selectMode();

        switch (mode) {
            case 1:
                List<Double> numbers = getNumbers();
                System.out.println("Suma liczb: " + Add.multiNumber(numbers));
                break;
            case 2:
                int first = getNumber("pierwszą");
                int second = getNumber("second");
                System.out.println("Suma liczb całkowitych z przedziału: [" +
                        first + "] - [" + second + "]\njest równa: " +
                        Add.numbersInterval(first, second));
                break;
        }
    }

    public static int selectMode() {
        String option = "";
        do {
            System.out.flush();
            System.out.println("Wybierz tryb:\n" +
                    "0 - zakończenie programu\n" +
                    "1 - obliczanie sumy podanych liczb\n" +
                    "2 - obliczanie sumy liczb całkowitych z podanego przedziału");
            option = scanner.nextLine();
            if (option.equals("0")) {
                System.exit(0);
            }
        } while (!(option.equals("1") || option.equals("2")));

        return Integer.parseInt(option);
    }

    public static List<Double> getNumbers() {
        ArrayList<Double> numbers = new ArrayList<Double>();
        System.out.println("Podaj pierwszą liczbę:");
        numbers.add(Double.parseDouble(scanner.nextLine()));
        String number;
        do {
            System.out.flush();
            System.out.println("Podane liczby: " + numbers.toString());
            System.out.println("Podaj kolejną liczbę lub wpisz '=' by zakończyć wprowadzanie:");
            number = scanner.nextLine();
            if (!number.equals("=")) {
                numbers.add(Double.parseDouble(number));
            }
        } while (!number.equals("="));

        return numbers;
    }

    public static int getNumber(String numberTitle) {
        System.out.flush();
        System.out.println("Podaj " + numberTitle + " liczbę:");

        return Integer.parseInt(scanner.nextLine());
    }
}
