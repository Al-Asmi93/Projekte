package BBQ_Aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaschenRechner {
    public static List<Double> ergebnisverlauf = new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner((System.in));
        boolean weiterBerechnen = true;

        System.out.println("Willkommen zum Taschenrechner");

        while (weiterBerechnen){

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
            int auswahl = scanner.nextInt();

            double ergebnis;
            System.out.println("Zahl: ");
            double zahl1 = scanner.nextDouble();

            switch (auswahl) {
                case 1:
                    System.out.print("Zahl 2: ");
                    double zahl2 = scanner.nextDouble();
                    ergebnis = zahl1 + zahl2;
                    break;

                case 2:
                    System.out.print("Zahl 2: ");
                    zahl2 = scanner.nextDouble();
                    ergebnis = zahl1 - zahl2;
                    break;

                case 3:
                    System.out.print("Zahl 2: ");
                    zahl2 = scanner.nextDouble();
                    ergebnis = zahl1 * zahl2;
                    break;

                case 4:
                    System.out.print("Zahl 2: ");
                    zahl2 = scanner.nextDouble();
                    if (zahl2 != 0) {
                        ergebnis = zahl1 / zahl2;
                    } else {
                        System.out.println("Fehler: Divesion durch Null ist nicht möglich");
                        continue;
                    }
                    break;

                case 5:
                    ergebnis = Math.sqrt(zahl1);
                    break;

                case 6:
                    System.out.println("Gib die Anzahl der Zahlen ein: ");
                    int anzahl = scanner.nextInt();
                    double summe = 0;
                    for (int i = 1; i <= anzahl; i++) {
                        System.out.print("Gib Zahl " + i + " ein: ");
                        double zahl = scanner.nextDouble();
                        summe += zahl;
                    }
                    ergebnis = summe / anzahl;
                    break;

                case 7:
                    double kapital;
                    double kapital1;
                    double zinssatz;
                    int jahr = 0;
                    System.out.print("Bitte das Kapital eingeben: ");
                    kapital = new Scanner(System.in).nextDouble();
                    kapital1 = kapital;
                    System.out.print("Bitte den Zinssatz eingeben: ");
                    zinssatz = new Scanner(System.in).nextDouble();
                    System.out.println("Kapital zu beginn: " + kapital1);
                    do {
                        kapital1 = kapital1 * (1 + zinssatz / 100);
                        jahr += 1;
                        System.out.println("Kapital nach " + jahr + " Jahren: " + kapital1);
                        ergebnis = kapital1 ;
                    }
                    while (kapital1 < kapital * 2);     // Abbruchbedingung
                    System.out.println("Das Verdoppeln dauert " + jahr + " Jahre.");
                    break;

                case 8:
                    System.out.println("Ergebnisverlauf: ");
                    for (double ergebniswert : ergebnisverlauf) {
                        System.out.println(ergebniswert);
                    }
                    continue;

                default:
                    System.out.println("Ungültige Auswahl");
                    continue;

            }

            if (auswahl >= 1 && auswahl <= 8) {
                ergebnisverlauf.add(ergebnis);
                System.out.println("das Ergebnis ist: " + ergebnis);
            }

            System.out.println("Möchten Sie eine weitere Berechnung durchführen? (Ja/Nein): ");
            String antwort = scanner.next();
            weiterBerechnen = antwort.equalsIgnoreCase("Ja");
        }

        System.out.println("Danke");
        scanner.close();

    }
}


