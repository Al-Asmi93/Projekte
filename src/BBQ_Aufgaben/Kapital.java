package BBQ_Aufgaben;
import java.util.Scanner;
public class Kapital {
    public static void main(String[] args) {
        double  k;          // Das eingegebene Kapital
        double  k1;         // das jeweils verzinste Kapital
        double  p;          // Zinssatz in %
        int     jahr = 0;       // Anzahl der Jahre
        System.out.print("Bitte das Kapital eingeben: ");
        k = new Scanner(System.in).nextDouble();
        k1 = k;
        System.out.print("Bitte den Zinssatz eingeben: ");
        p = new Scanner(System.in).nextDouble();
        System.out.println("Kapital zu beginn: " + k1);
        do {     // fußgesteuerte Schleife, auf jeden Fall einmal durchlaufen
            k1 = k1 * (1 + p / 100);
            jahr += 1;
            System.out.println("Kapital nach " + jahr + " Jahren: " + k1);
        }
    while (k1 < k * 2);     // Abbruchbedingung
    System.out.println("Das Verdoppeln dauert " + jahr + " Jahre.");
    }
}

