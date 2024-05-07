package BBQ_Aufgaben;

public class Uebung_2 {
    public static void main(String[] args) {
        char buchstabe = 'V';
        int rotation = 6;
        int alphabetStart = 'A'-1;
        buchstabe -= alphabetStart;
        buchstabe += rotation;
        buchstabe %= 26;
        buchstabe += alphabetStart;
        System.out.println(buchstabe);
    }
}
