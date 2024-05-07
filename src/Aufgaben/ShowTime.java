package Aufgaben;

import java.util.Scanner;

public class ShowTime {
    public static void main(String[] args) {

        int sec;
        int hour = 0;
        int minute;

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib ");
        sec = eingabe.nextInt();
        
        if (sec >= 3600) {
            hour = sec / 3600;
            int second = sec - hour * 3600;
            minute = second / 60;
            second = second - minute * 60;
            System.out.println(hour + ":" + minute + ":" + second);
        } else {
            minute = sec / 60;
            int second = sec - minute * 60;
            System.out.println(hour + ":" + minute + ":" + second);
        }
    }

}

