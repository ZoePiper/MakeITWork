package model;

public class Zzper extends Persoon implements Oproepbaar{
    private double uurtarief;
    private int urenGewerkt;

    public Zzper(String naam, String woonplaats, Afdeling afdeling, double uurtarief) {
        super(naam, woonplaats, afdeling);
        this.uurtarief = uurtarief;
        this.urenGewerkt = 0;
    }


    @Override
    public int huurIn(int uren) {
        return urenGewerkt += uren;
    }

    @Override
    public double berekenJaarInkomen() {
        return uurtarief * urenGewerkt;
    }

    @Override
    public String toString() {
        return super.toString() + " is een zzp-er met een uurtarief van " + uurtarief;
    }

    public double getUurtarief() {
        return uurtarief;
    }

    public void setUurtarief(double uurtarief) {
        this.uurtarief = uurtarief;
    }

    public int getUrenGewerkt() {
        return urenGewerkt;
    }

    public void setUrenGewerkt(int urenGewerkt) {
        this.urenGewerkt = urenGewerkt;
    }
}
