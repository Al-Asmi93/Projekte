package BBQ_Aufgaben;

public class Tempo {
    public static void main(String[] args){
        final long timeStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {

        }
        final long timeend = System.nanoTime();
        System.out.println("Verlaufzeit der Schleife: " + (timeend - timeStart));
    }
}
