package BBQ_Aufgaben;
import java.util.Scanner;
public class Puls {
    public static void main(String[]args) {
        int startPuls = 90;
        int maxPuls = 160;
        int i = 1;

        do {
            System.out.println("Wie hoch ist der Puls?");
            startPuls = new Scanner(System.in).nextInt();

            if (startPuls < maxPuls)
                System.out.println("Leistungsstufe erhöht: " + (i = ++ i) + "\n" + "Checke den Puls in 60 Sekunden erneut");

            else
                System.out.println("Leistungsstufe reduzieren: " + (i = -- i));
        }

        while (startPuls == maxPuls);

        do {
            System.out.println("Wie hoch ist der Puls?");
            maxPuls = new Scanner(System.in).nextInt();

            if (maxPuls > startPuls)
                System.out.println("Leistungsstufe weiter reduzieren:" + (i = -- i) + "\n" + "Checke den Puls in 60 Sekundenerneut");

            else
                System.out.println("Leistungsstufe erhöhen:" + (i = ++ i));
        }

        while (maxPuls >= startPuls);
    }
}

