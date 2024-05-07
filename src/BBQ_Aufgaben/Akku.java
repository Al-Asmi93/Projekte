package BBQ_Aufgaben;

import java.util.Scanner;

public class Akku {
    public static void main(String[] args){

// hier soll eine eingabe stattfinden,per scanner
        String Geraet = "Handy";
        int akku;

        Scanner eingabe = new Scanner(System.in);
        akku = eingabe.nextInt();
        System.out.println("dein " + Geraet + "\sAkkuladund ist " + akku);

        if(akku <= 25){
            System.out.println("ROT - niedrige Akkuladung");
        }
        else if(akku <= 50){
            System.out.println("GELB - mittlere Akkuladung");
        }
        else if(akku < 100)
        {
            System.out.println("GRÜN - gute Akkuladung");
        }
        else
        {
            System.out.println("du hast noch => 100% Akku-Ladung auf deinem" +"\s"+ Geraet);
        }

    }

}

