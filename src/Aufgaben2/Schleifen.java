package Aufgaben2;

public class Schleifen {
    public static void main(String[] args){
        /*for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print('*');

            System.out.println();
        }*/

        /*int x, y;
        for (x = initX(); y = initY; x++, y++; x < 10 || y < 10; ){

        }*/
        /*System.out.println("gib eine Zahl ein:");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int i = input; i != 11; i++){
            System.out.println(i);
        }*/

        aussen:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + ", " + j);
                if(i==5) {
                    continue;
                } else {
                    continue aussen;
                }
            }
        }

        heaven:
        while (true){
            hell:
            while (true)
                break hell;
                System.out.println("hell");

        }
        //System.out.println("heaven");
    }
}
