package BBQ_Aufgaben;
import java.util.Random;

public class ZufallsZahlen {
    public static void main(String[] args) {
        double zufallszahlen[] = new double[10];
        Random zufall = new Random();

        for (int i = 0; i < zufallszahlen.length; i++) {
            zufallszahlen[i] = zufall.nextDouble(9) + 1;
        }

        for (int i = 0; i < zufallszahlen.length; i++) {
            System.out.println(i + " -> " + zufallszahlen[i]);
        }

    }

}
