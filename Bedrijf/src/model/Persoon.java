package model;

import java.util.Collections;

public abstract class Persoon implements Comparable<Persoon> {
    private static final double GRENSWAARDE_BONUS = 4500.00;
    protected static final String DEFAULTWAARDE_NAAM = "onbekend";
    protected static final String DEFAULTWAARDE_WOONPLAATS = "onbekend";

    public static int aantalPersonen = 0;
    protected int personeelsNummer;

    protected String naam;
    protected String woonplaats;
    protected Afdeling afdeling;

    public Persoon(String naam, String woonplaats, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.afdeling = afdeling;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, "Onbekend", new Afdeling());
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon() {
        this("Onbekend", "Onbekend", new Afdeling());
        this.personeelsNummer = ++aantalPersonen;
    }

    public abstract double berekenJaarInkomen();


    ////    public boolean heeftRechtOpBonus() {
////        if (maandSalaris >= GRENSWAARDE_BONUS) {
////            System.out.println("wel");
////        }else {
////            System.out.println("geen");
////        }return heeftRechtOpBonus();
////    }
////
////
    public static int getAantalPersonen() {
        return aantalPersonen;
    }

    public static void setAantalPersonen(int aantalPersonen) {
        Persoon.aantalPersonen = aantalPersonen;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public void setPersoneelsNummer(int personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    @Override
    public String toString() {
        return naam + " woont in " + woonplaats + " en werkt op afdeling " + afdeling.getAfdelingsNaam() + " te " + afdeling.getAfdelingsPlaats();
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    @Override
    public int compareTo(Persoon ander) {
        return this.naam.compareTo(ander.naam);
    }

}