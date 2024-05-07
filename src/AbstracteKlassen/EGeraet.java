package AbstracteKlassen;

public abstract class EGeraet {
    private boolean istEingeschaltet;
    private String bezeichnung;
    private int leistungInWatt;


    public abstract void einschalten();

    public abstract void ausschalten();

    public EGeraet (String bezeichnung, int leistungInWatt) {
        super();
        this.bezeichnung = bezeichnung;
        this.leistungInWatt = leistungInWatt;
    }

    public boolean isIstEingeschaltet() {
        return istEingeschaltet;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getLeistungInWatt() {
    return leistungInWatt;
    }
}

