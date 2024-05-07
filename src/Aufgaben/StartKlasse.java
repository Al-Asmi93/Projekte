package Aufgaben;

public class StartKlasse {
    public static void main(String[] args){
       Auto Auto1 = new Auto("Porschee", "schwarz", 655);
       Auto Auto2 = new Auto("Oldtimer", "Rot", 150);
       Auto Auto3 = new Auto("Lamborghini", "Weiß", 420);

        System.out.println("------------------------------------------------------------");
        Auto1.informationenAusgeben();
        Auto1.geschwindigkeitAusgeben();
        System.out.println("------------------------------------------------------------");
        Auto2.informationenAusgeben();
        Auto2.geschwindigkeitAusgeben();
        System.out.println("------------------------------------------------------------");
        Auto3.informationenAusgeben();
        Auto3.geschwindigkeitAusgeben();
       ;
    }
}
