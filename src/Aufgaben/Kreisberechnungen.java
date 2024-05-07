package Aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Kreisberechnungen {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        double eingabe1;
        boolean weiterberechnen = true;


        DecimalFormat f = new DecimalFormat("#0");
        DecimalFormat g = new DecimalFormat("#0.00");


        while (weiterberechnen) {
            System.out.println(ANSI_RED + "Bitte geben Sie den Radius des Kreises in cm ein:" + ANSI_RESET);
            Scanner eingabe = new Scanner(System.in);
            eingabe1 = Double.parseDouble(eingabe.next());

            System.out.println(ANSI_YELLOW + "Der Flächeninhalt von einem Kreis mit einem Radius von "+ ANSI_GREEN + f.format(eingabe1) + ANSI_YELLOW +" cm beträgt: " + ANSI_GREEN + g.format(berechneFlaecheninhalt(eingabe1)) + ANSI_YELLOW + " qcm");
            System.out.println(ANSI_YELLOW + "Der Kreisumfang von einem Kreis mit einem Radius von " + ANSI_GREEN + f.format(eingabe1) + ANSI_YELLOW + " cm beträgt: " + ANSI_GREEN + g.format(berechneUmfang(eingabe1)) + ANSI_YELLOW + " cm");

            System.out.println("\n" + ANSI_BLUE + "Möchten Sie eine weitere Berechnung durchführen?" + ANSI_GREEN + " (Ja/Nein): " + ANSI_RESET);
            String antwort = eingabe.next();
            weiterberechnen = antwort.equalsIgnoreCase("Ja");
        }
        System.out.println("Danke!");
    }
    public static double berechneFlaecheninhalt(double radius) {
        return radius * radius * Math.PI;
    }

    public static double berechneUmfang(double radius) {
        return 2 * Math.PI * radius;
    }
}
