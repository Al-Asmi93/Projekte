package Person;

public class Buch {
    int erscheinungsJahr;
    String titel;
    String autor;
    String genre;

    public Buch(int e, String t, String a, String g){
        this.erscheinungsJahr = e;
        this.titel = t;
        this.autor = a;
        this.genre = g;
    }

    public int getErscheinungsJahr() {
        return erscheinungsJahr;
    }

    public void setErscheinungsJahr(int erscheinungsJahr) {
        this.erscheinungsJahr = erscheinungsJahr;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
