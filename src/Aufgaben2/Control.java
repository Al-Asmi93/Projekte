package Aufgaben2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        String name;
        LocalDate geburtsdatum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Name ein:");
        name = scanner.nextLine();
        System.out.println("Bitte geben Sie Ihr Geburtsdatum ein (yyyy-mm-dd):");
        String datum = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        geburtsdatum = LocalDate.parse(datum, formatter);

        System.out.println("\nIhr Name ist:\s" + name);
        int alter = Period.between(geburtsdatum, LocalDate.now()).getYears();
        System.out.println("Ihr Alter ist:\s" + alter + "\sJahre" +"\n");

        if(alter < 18 || alter >= 45){
            System.out.println("\nIhr Name ist:\s" + name + ", Ihr Alter ist:\s" + alter + "\sJahre," + "\sSie dürfen nicht rein, nicht bei(-fsk18 und +fsk45)");
        }else {
            System.out.println("\nIhr Name ist:\s" + name + ", Ihr Alter ist:\s" + alter + "\sJahre," + "\sSie dürfen rein(+fsk18)");
        }


    }
}
