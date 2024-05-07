package Person;

public class Auto {
    int baujahr;
    String hersteller;
    String modell;

    public Auto(int b, String h, String m){
        this.baujahr = b;
        this.hersteller = h;
        this.modell = m;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
}
