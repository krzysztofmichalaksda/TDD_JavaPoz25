package personal;

import personal.person.Pesel;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Pesel pesel1;
        do {
            System.out.println("Podaj PESEL: ");
            String pesel = scanner.nextLine();
            pesel1 = new Pesel(pesel);
            if (pesel1.isCorrect()) {
                System.out.println("Podany PESEL jest poprawny.");
            } else {
                System.out.println("Podany PESEL jest niepoprawny.");
            }
        } while (!pesel1.isCorrect());
    }
}
