package BBQ_Aufgaben;

import java.util.Random;
import java.util.Scanner;

public class ZahlErraten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int zuErratendeZahl = random.nextInt(max - min + 1) + min;
        int gerateneZahl;
        int versuche = 0;

        System.out.println("Willkommen beim Zahl erraten Spiel!");
        System.out.println("Ich habe eine Zahl zwischen " + min + " und " + max + " gewählt.");


        do {
            System.out.println("Rate die Zahl: ");
            gerateneZahl = scanner.nextInt();
            versuche++;
            if (gerateneZahl < zuErratendeZahl) {
                System.out.println("die Zahl ist großer.");
            } else if (gerateneZahl > zuErratendeZahl) {
                System.out.println("die Zahl ist kleiner.");
            } else {
                System.out.println("Glückwunsch! Du hast die Zahl in " + versuche + " Versuchen erraten!");
            }
        } while (gerateneZahl != zuErratendeZahl);

    }
}
