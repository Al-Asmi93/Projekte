package BBQ_Aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rechner {
    private static final List<Double> ergebnisverlauf = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean weiterBerechnen = true;

            System.out.println("Willkommen zum Taschenrechner");

            while (weiterBerechnen) {
                displayMenu();
                int auswahl = scanner.nextInt();

                double ergebnis = 0;

                switch (auswahl) {
                    case 1:
                        ergebnis = performOperation(scanner, Operation.ADD);
                        break;
                    case 2:
                        ergebnis = performOperation(scanner, Operation.SUBTRACT);
                        break;
                    case 3:
                        ergebnis = performOperation(scanner, Operation.MULTIPLY);
                        break;
                    case 4:
                        ergebnis = performOperation(scanner, Operation.DIVIDE);
                        break;
                    case 5:
                        ergebnis = performOperation(scanner, Operation.SQUARE_ROOT);
                        break;
                    case 6:
                        ergebnis = calculateAverage(scanner);
                        break;
                    case 7:
                        calculateInterest(scanner);
                        break;
                    case 8:
                        displayErgebnisverlauf();
                        continue;
                    default:
                        System.out.println("Ungültige Auswahl");
                        continue;
                }

                ergebnisverlauf.add(ergebnis);
                System.out.println("Das Ergebnis ist: " + ergebnis);

                System.out.println("Möchten Sie eine weitere Berechnung durchführen? (Ja/Nein): ");
                String antwort = scanner.next();
                weiterBerechnen = antwort.equalsIgnoreCase("Ja");
            }

            System.out.println("Danke");
        }
    }

    private static void displayMenu() {
        System.out.println("Wählen Sie eine Operation: ");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Wurzel");
        System.out.println("6. Durchschnittberechnen");
        System.out.println("7. Kapital Berechnen");
        System.out.println("8. Ergebnisverlauf");
        System.out.print("Ihre Auswahl: ");
    }

    private static double performOperation(Scanner scanner, Operation operation) {
        System.out.print("Zahl 1: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Zahl 2: ");
        double operand2 = scanner.nextDouble();

        switch (operation) {
            case ADD:
                return operand1 + operand2;
            case SUBTRACT:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    System.out.println("Fehler: Division durch Null ist nicht möglich");
                    return 0; // You can handle this differently based on your requirements
                }
            case SQUARE_ROOT:
                return Math.sqrt(operand1);

            default:
                throw new IllegalArgumentException("Ungültige Operation");
        }
    }

    private static double calculateAverage(Scanner scanner) {
        System.out.println("Gib die Anzahl der Zahlen ein: ");
        int anzahl = scanner.nextInt();
        double summe = 0;
        for (int i = 1; i <= anzahl; i++) {
            System.out.print("Gib Zahl " + i + " ein: ");
            double zahl = scanner.nextDouble();
            summe += zahl;
        }
        return summe / anzahl;
    }

    private static void calculateInterest(Scanner scanner) {
        System.out.print("Bitte das Kapital eingeben: ");
        double kapital = scanner.nextDouble();
        double kapital1 = kapital;

        System.out.print("Bitte den Zinssatz eingeben: ");
        double zinssatz = scanner.nextDouble();

        int jahr = 0;

        System.out.println("Kapital zu Beginn: " + kapital1);

        do {
            kapital1 = kapital1 * (1 + zinssatz / 100);
            jahr += 1;
            System.out.println("Kapital nach " + jahr + " Jahren: " + kapital1);
        } while (kapital1 < kapital * 2);

        System.out.println("Das Verdoppeln dauert " + jahr + " Jahre.");
    }

    private static void displayErgebnisverlauf() {
        System.out.println("Ergebnisverlauf: ");
        for (double ergebniswert : ergebnisverlauf) {
            System.out.println(ergebniswert);
        }
    }

    private enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE, SQUARE_ROOT, AVERAGE, INTEREST
    }
}
