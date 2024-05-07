package AbstracteKlassen;

public class Radio extends Unterhaltungsgeraet {

    int anzahlSender;
    int aktuellenKanal;

    public Radio(String bezeichnung, int leistungInWatt, int anzahlSender) {
        super(bezeichnung, leistungInWatt);
        this.anzahlSender = anzahlSender;
    }

    public int getAnzahlSender() {
    return anzahlSender;
    }

    public int getAktuellenKanal() {
        return aktuellenKanal;
    }

    public void wechselSender(int senderNeu) {
        this.aktuellenKanal = senderNeu;
    }
    @Override
    public void einschalten() {
    }

    @Override
    public void ausschalten() {
    }

    @Override
    public void lauter()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void leiser() {

    }
}
