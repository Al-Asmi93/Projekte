package Aufgaben;

public class EinkaufTest {
    public static void main(String[] args){
        int anzahlBierimKuhlschrank = 1;
        boolean neuesBierKaufen = anzahlBierimKuhlschrank <= 2;
        boolean feiertag = true;
        boolean wochenende = false;
        boolean findePrima = feiertag && !wochenende;
        findePrima = feiertag ^ wochenende;
        int barGeld = 30;
        int schuhePreis = 100;
        int kontoStand = 100;

        boolean neue_schuhe_kaufen = (barGeld >= schuhePreis) | (kontoStand >= schuhePreis);

        if (neuesBierKaufen){
            System.out.println("ich kaufe einen neuen Kasten." + "\n");
        } else {
            System.out.println("ich brauche kein Bier" + "\n");


        }if (findePrima){
            System.out.println("ich Ich finde es prima, wenn Feiertag ist, aber kein Wochenende." + "\n");
        } else {
            System.out.println("Ich finde es prima, wenn Feiertag ist oder Wochenende, aber nicht beides gleichzeitig." + "\n");
        }

        if (neue_schuhe_kaufen){
            System.out.println("Ich muss meiner Freundin neue Schuhe kaufen");
        } else {
            System.out.println("ich habe kein Geunges Geld");
        }
    }
}
