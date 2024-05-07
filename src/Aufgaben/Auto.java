package Aufgaben;
import java.util.Scanner;

public class Auto {
    String Marke;
    String Farbe;
    int MotorLeistung;
    int aktuelleGeschwindigkeit;

    public Auto(String Marke, String Farbe, int MotorLeistung) {
        this.Marke = Marke;
        this.Farbe = Farbe;
        this.MotorLeistung = MotorLeistung;

        // Nur einmal die aktuelle Geschwindigkeit für jedes Auto eingeben
        eingabeAktuelleGeschwindigkeit();

        // Informationen des Autos und Geschwindigkeit ausgeben
        informationenAusgeben();
        geschwindigkeitAusgeben();
    }

    private void eingabeAktuelleGeschwindigkeit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die aktuelle Geschwindigkeit des Autos " + this.Marke + " ein:");
        this.aktuelleGeschwindigkeit = scanner.nextInt();
        int beschleunigen;
        int bremsen;
        if (this.aktuelleGeschwindigkeit >= 30) {
            System.out.println("Ich beschleunige um: " + (beschleunigen = this.aktuelleGeschwindigkeit + 10) + " km/h");
            this.aktuelleGeschwindigkeit = this.aktuelleGeschwindigkeit + beschleunigen;
        } else {
            System.out.println("Ich bremse um: " + (bremsen =this.aktuelleGeschwindigkeit - 10) + " km/h");
            this.aktuelleGeschwindigkeit = this.aktuelleGeschwindigkeit - bremsen;

        }
    }

    public void informationenAusgeben() {
        System.out.println("Auto Marke: " + this.Marke);
        System.out.println("Farbe: " + this.Farbe);
        System.out.println("Motorleistung: " + this.MotorLeistung + " km/h");
    }

    public void geschwindigkeitAusgeben() {
        System.out.println("Aktuelle Geschwindigkeit: " + this.aktuelleGeschwindigkeit + " km/h");
        System.out.println(); // Leere Zeile für bessere Lesbarkeit
    }

}
