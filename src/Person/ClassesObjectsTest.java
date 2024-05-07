package Person;

import java.util.ArrayList;

public class ClassesObjectsTest {
    public static void main(String[] args) {
        ClassesObjects co = new ClassesObjects();

        int i = 3;
        String s = "trekkerfahren";
        String string = new String("Busfahren");

        System.out.println(co.alter);
        System.out.println(co.alter);
        System.out.println(co.firstName + " " +co.lastName);
        System.out.println(co.fahrerlaubnis) ;
        System.out.println(co.fullName);
        co.fahrerlaubnis = false;
        System.out.println("du machst:" + s);
        System.out.println(string);
        System.out.println("du machst:" + s);
        System.out.println("dein voller name ist: " + co.firstName +"\s"+ co.lastName);


        System.out.println(co.alter);
        System.out.println(co.firstName);
        System.out.println(co.fahrerlaubnis);

        co.alter = ++co.alter;

        System.out.println();
        System.out.println(co.alter);
        System.out.println(co.firstName);
        System.out.println(co.fahrerlaubnis);

        co.fahrerlaubnis = true;
        System.out.println();
        System.out.println(co.alter);
        System.out.println(co.firstName);
        System.out.println(co.fahrerlaubnis);

        int bez = 2;
        String str = "nochmal";
        ClassesObjects clob = new ClassesObjects();
        Person person = new Person();
        person.firstName = "hans";
        person.lastName = "hansen";
        ArrayList arrayList = new ArrayList();


        Auto auto2 = new Auto(2011, "seat", "leon");
        auto2.setBaujahr(2011);
        auto2.setHersteller("seat");
        auto2.setModell("leon");


        Auto auto3 = new Auto(2003, "suzuki", "wagon r");
        System.out.println(auto3.getBaujahr());
        System.out.println(auto2.getHersteller() + "\n");

        Buch buch1 = new Buch(1897, "Mark Twain", "Tom Sawyer", "Roman");
        Buch buch2 = new Buch(2020, "Hermann Abs", "Java-grundkurs", "Sachbuch");

        System.out.println("Erscheinungsjahr: " + buch1.erscheinungsJahr + ", Titel: " + buch1.titel + ", Autor: " + buch1.autor + ", Genre: " + buch1.genre);
        System.out.println("Erscheinungsjahr: " + buch2.erscheinungsJahr + ", Titel: " + buch2.titel + ", Autor: " + buch2.autor + ", Genre: " + buch2.genre);
    }
}
