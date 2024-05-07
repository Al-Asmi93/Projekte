package BBQ_Aufgaben;
import java.util.Scanner;

//Aufgabe an alle: bitte per ScannerKlasse und Objekt erweitern um  eingabe der zeichen zu ermöglichen
public class Charrs {

    public static void main(String[] args ) {
        String zeichenkette;

        char zeichen = 'A';
        char zeichen2 = 64;

        Scanner eingabe = new Scanner(System.in);
        System.out.println("geben Sie eine Zeichenkette ein:");
        zeichenkette = eingabe.next();

        System.out.println("Zeichenkette: " + zeichenkette);
        System.out.println("Ein Zeichen: " + zeichen);
        System.out.println("Besonderes Zeichen: " + zeichen2);
        System.out.println("Zeichenkette: " + zeichenkette + 1);
        System.out.println("Ein Zeichen + 1: " + (char) (zeichen + 1));

        zeichen2 = '\u011A';
        System.out.println("Besonderes Zeichen: " + zeichen2);


        char kette[] = zeichenkette.toCharArray();

        for (int i = 0 ; i < zeichenkette.length() ; i++ )
        {
            System.out.println("Zeichen an Position " + i + " ist: " + zeichenkette.charAt(i));
        }

        char besonderes = '\u26a0';		// \u270C
        System.out.println("Besonderes Zeichen: " + besonderes);
    }

}
