package model;

import java.util.Collection;
import java.util.Collections;

public abstract class Figuur implements ToelaatbaarInOppervlak, Comparable<Figuur> {
    protected final static double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    protected final static String DEFAULTWAARDE_KLEUR = "wit";
    protected String kleur;


    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULTWAARDE_KLEUR);
    }

    //static methode
    public static String geefDefinitie() {
        return "Een figuur is een verzameling punten";
    }


    public abstract double geefOmtrek();

    public abstract double geefOppervlakte();

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "ik ben groot!!!";
        } else {
            return "Ik ben klein!!!";
        }
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    @Override
    public String toString() {
        return "Kleur: " + kleur + "\nOmtrek: " + geefOmtrek() + "\nOppervlakte: " + geefOppervlakte();
    }

    @Override
    public int compareTo(Figuur anderFiguur) {
        if (this.geefOppervlakte() > anderFiguur.geefOppervlakte()) {
            return 1;
        } else if (this.geefOppervlakte() < anderFiguur.geefOppervlakte()) {
            return -1;
        } else {
            return 0;
        }
    }
    public boolean pastInOppervlak(double lengte, double breedte) {
        return false;
    }
}

