package BBQ_Aufgaben;

import java.util.Scanner;

public class WochenTage {
    public static void main(String[] args) {
        String wochentag;

       /* wochentag [0]  ="Samstag";
        wochentag [1]  ="Sontag";
        wochentag [2]  ="Montag";
        wochentag [3]  ="Dienstag";
        wochentag [4]  ="Mittwoch";
        wochentag [5]  ="Donnerstag";
        wochentag [6]  ="Freitag";*/

        Scanner eingabe = new Scanner(System.in);
        wochentag = eingabe.next();
        System.out.println(wochentag);
    }
}
