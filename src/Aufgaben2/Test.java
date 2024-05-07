package Aufgaben2;

public class Test {
    public static void main (String[] args){
        int summe = 0;
        for (int i = 1; i<=100; i++){
            summe += i;
            System.out.println(summe);
        }

        int[] zahlen = new int[6];
        zahlen[0] = 32;
        zahlen[1] = 42;
        zahlen[2] = 0;
        zahlen[3] = 17;
        int[] zahle = {32, 42, 0, 17,0,0};
        System.out.println("Die Zahl ist: " + zahlen[0]);
    }
}
