package Aufgaben;

public class AusgabeZahl {
    public static void main(String[] args) {
        int summe = 9;
        int zahl = 0;
        while (summe <= 100) {
            zahl += 1;
            summe += zahl;
        }
        System.out.println(zahl);
    }
}
