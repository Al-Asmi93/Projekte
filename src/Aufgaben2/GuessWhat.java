package Aufgaben2;

public class GuessWhat {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 10 + 1);
        while (true) {
            System.out.println("Welche Zahl denke ich mir zwischen 1 und 10?");
            int guess = new java.util.Scanner(System.in).nextInt();
            if (number == guess) {
                System.out.println("Super getippt!");
                break;
            } else if (number > guess)
                System.out.println("Nee, meine Zahl ist größer als deine!");
            else if (number < guess)
                System.out.println("Nee, meine Zahl ist kleiner als deine!");
        }
    }
}

