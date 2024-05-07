package Bibliothek;

import java.util.Arrays;
import java.util.Scanner;

public class TestBibliothek {
    public static void main(String[] args){
        Buch buch = new Buch();
        Regal regal = new Regal();
        Seite seite = new Seite();
        Bibliothek bibliothek = new Bibliothek();
        Scanner input = new Scanner(System.in);
        for (String s : Arrays.asList("Bitte geben Sie die folgende Information ein \u263B", "Bibliothek Name:")) {
            System.out.println(s);
        }
        bibliothek.name = input.nextLine();
        System.out.println("Regal Bezeichnung:");
        regal.Bezeichnung = input.nextLine();
        System.out.println("Buch Titel:");
        buch.Titel= input.nextLine();
        System.out.println("Wie viele Seiten hat das Buch " + buch.Titel + "?");
        seite.Nummer = input.nextInt();
        System.out.println("Wie viele Wörter hat das Buch " + buch.Titel + "?");
        seite.wortAnzahl = input.nextInt();
        /*bibliothek.name = "Faissal";
        regal.Bezeichnung = "131B";
        buch.Titel = "AlSaif";
        seite.Nummer = 320;
        seite.wortAnzahl = 10100234;*/

        System.out.println("\nBibliothek Name: " + bibliothek.name + "\nRegal Bezeichnung: " + regal.Bezeichnung + "\nBuch Titel: " + buch.Titel + "\n" + buch.Titel + " hat " + seite.Nummer + " Seiten und " + seite.wortAnzahl + " Wörter");
    }
}
