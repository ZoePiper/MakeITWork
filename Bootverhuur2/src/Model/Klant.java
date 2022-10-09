package Model;

public class Klant {
    private String naam;
    private String emailadres;
    private static boolean vaarVaardig;

    public Klant() {
        this("onbekend");
    }

    public Klant(String naam) {
        this(naam, "onbekend", false);
    }

    public Klant(String naam, String emailadres, boolean vaarVaardig) {
        this.naam = naam;
        this.emailadres = emailadres;
        this.vaarVaardig = vaarVaardig;
    }

    public static boolean isVaarVaardig() {
        return vaarVaardig;
    }
    @Override
    public String toString(){
        return "Klant " +naam;
    }
}