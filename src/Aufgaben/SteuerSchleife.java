package Aufgaben;

public class SteuerSchleife {
    public static void main(String[] args){
        int i = 0;
        for (int summe = 100 ; i <= 1000 ; i++ )        // Zähler ; Abbruchbedingung ; Schritt
        {
            summe += i;
        }
        System.out.println(i);
    }
}
