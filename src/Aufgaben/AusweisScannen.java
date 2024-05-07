package Aufgaben;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AusweisScannen {
    public static void main(String[] args) {
        String VollstaendigerName;
        LocalDate geburtsdatum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren vollständigen Namen ein:");
        VollstaendigerName = scanner.nextLine();

        System.out.println("Bitte geben Sie Ihr Geburtsdatum ein (yyyy-mm-dd):");
        String datumString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        geburtsdatum = LocalDate.parse(datumString, formatter);

        System.out.println("\nVollstaendiger Name: " + VollstaendigerName);
        int alter = Period.between(geburtsdatum, LocalDate.now()).getYears();
        System.out.println("Alter: " + alter + "\sJahre"+"\n");

        if (alter >= 18 && alter <= 45) {
            System.out.println("Sie dürfen rein");
        } else {
            System.out.println("Sie dürfen nicht rein");
        }
    }
}

