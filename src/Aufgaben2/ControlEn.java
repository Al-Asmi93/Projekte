package Aufgaben2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControlEn {
    public static void main(String[] args) {
        String name;
        LocalDate birthOfDate; // or bod
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        name = scanner.nextLine();
        System.out.println("Please enter your birthday (yyyy-mm-dd):");
        String input = scanner.nextLine();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        birthOfDate = LocalDate.parse(input, dateFormatter);

        System.out.println("\nYour name:\s" + name);
        int age = Period.between(birthOfDate, LocalDate.now()).getYears();
        System.out.println("Your are:\s" + birthOfDate + "\syears old" + "\n");

        if (age < 18 || age >= 45) {
            System.out.println("\nYour name is:\s" + name + ", your age is:\s" + age + "\s" + "\sYou're not allowed to enter this place (-fsk18 und +fsk45)");
        } else {
            System.out.println("\nYour name is:\s" + name + ", your age is:\s" + age + "\s," + "\sYou're allowed to enter this place (+fsk18)");
        }


    }
}
