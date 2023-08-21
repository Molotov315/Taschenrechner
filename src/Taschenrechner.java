import java.util.Scanner;

public class Taschenrechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1. Addieren");
            System.out.println("2. Subtrahieren");
            System.out.println("3. Multiplizieren");
            System.out.println("4. Dividieren");
            System.out.println("5. Programm verlassen");

            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Programm wird beendet.");
                break;
            }

            System.out.println("Bitte geben Sie zwei Zahlen ein (getrennt durch ein Leerzeichen):");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            switch (option) {
                case 1 -> System.out.println("Ergebnis: " + (num1 + num2));
                case 2 -> System.out.println("Ergebnis: " + (num1 - num2));
                case 3 -> System.out.println("Ergebnis: " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0) {
                        System.out.println("Ergebnis: " + (num1 / num2));
                    } else {
                        System.out.println("Division durch 0 ist nicht erlaubt.");
                    }
                }
                default -> System.out.println("Ungültige Option.");
            }
        }

        scanner.close();
    }
}