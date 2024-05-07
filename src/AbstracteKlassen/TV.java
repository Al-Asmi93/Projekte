package AbstracteKlassen;

public class TV extends Unterhaltungsgeraet{

    private int anzahlSender;
    private  int aktuelleKananl;

    public TV(String bezeichnung, int leistungInWatt, int anzahlSender) {
        super(bezeichnung, leistungInWatt);
        this.anzahlSender = anzahlSender;
    }

    public void wechselSender(int senderNeu) {
        this.aktuelleKananl = senderNeu;

    }

    @Override
    public void einschalten() {

    }

    @Override
    public void ausschalten() {

    }

    @Override
    public void lauter() {

    }

    @Override
    public void leiser() {

    }
}
