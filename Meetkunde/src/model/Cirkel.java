package model;

public class Cirkel extends Figuur {
    private double straal;
    private Punt middelpunt;

    public Cirkel(String kleur, double straal, Punt middelpunt)  {
        super(kleur);
        if (straal <= 0) {
            throw new IllegalArgumentException("De straal moet positief zijn. De straal wordt op 1 gezet");
        }
        this.straal = straal;
        this.middelpunt = middelpunt;
    }



    public Cirkel(double straal) {
        this(DEFAULTWAARDE_KLEUR, straal, new Punt());
    }

    public Cirkel() {
        this(1);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) throws IllegalArgumentException {
        if (straal <= 0) {
            throw new IllegalArgumentException("De straal moet positief zijn. De straal wordt op 1 gezet");
        }
        this.straal = straal;
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }

    public void setMiddelpunt(Punt middelpunt) {
        this.middelpunt = middelpunt;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStraal: " + straal + "\nMiddelpunt: "
                + middelpunt.toString();
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        return straal <= breedte / 2;
    }
}

