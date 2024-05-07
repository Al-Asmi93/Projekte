package BBQ_Aufgaben;

import java.util.Scanner;

public class DurschSchnittberechnen {
    public static void main(String[] args) {

        double ergebnis = 0;

        System.out.println("Bitte geben Sie die Anzahl der Zahlen ein:");
        Scanner scanner = new Scanner(System.in);
        int anzahl = scanner.nextInt();

        double summe = 0;

        for (int i = 1; i <= anzahl; i++) {
            System.out.print("Geben Sie die Zahl " + i + " ein: ");
            double zahl = scanner.nextDouble();
            summe += zahl;
        }
        ergebnis = summe / anzahl;
        System.out.println("Das Ergebnis ist: " + ergebnis);
    }
}
