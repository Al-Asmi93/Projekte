package AbstracteKlassen;

public abstract class Unterhaltungsgeraet extends EGeraet{

    private int lautstaerke;

    public abstract void lauter();

    public abstract void leiser();

    public Unterhaltungsgeraet( String bezeichnung , int leistungInWatt ) {
        super( bezeichnung , leistungInWatt );
    }


}

