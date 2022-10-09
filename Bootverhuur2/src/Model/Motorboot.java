package Model;

public class Motorboot extends Boot {
    private static final int LENGTE_GRENS = 15;
    private static final int SNELHEID_GRENS = 20;
    private static final int PRIJS_LENGTE_GRENS = 10;
    private static final double PRIJS_LAAG = 60.0;
    private static final double PRIJS_HOOG = 90.0;
    private int maxSnelheid;


    public Motorboot(String naam, int lengte, int maxSnelheid) {
        super(naam, lengte);
        this.maxSnelheid = maxSnelheid;
    }

    //is al boolean, dus als het waar is dan is een vaarbewijs verplicht
    public boolean isVaarbewijsPlichtig() {
        return getLengte() > LENGTE_GRENS || maxSnelheid > SNELHEID_GRENS;
    }

    @Override
    public double berekenHuurprijs() {
        double huurprijs;
        if (getLengte()< PRIJS_LENGTE_GRENS) {
            huurprijs = PRIJS_LAAG;
        } else {
            huurprijs = PRIJS_HOOG;
        }
        return huurprijs;
    }

    // super.toString haalt de toString op van superclass
    // Nieuw variabel maken voor in de toSting na checken of het true of false is
    public String toString() {
        String vaarBewijsPlichtig;
        if (isVaarbewijsPlichtig()) {
            vaarBewijsPlichtig = "ja";
        } else {
            vaarBewijsPlichtig ="nee";
        }
        return String.format("Motor%s\n\tVaarbewijs vereist : %s\n\tHuurprijs: %.2f euro\n",
                super.toString(), vaarBewijsPlichtig, berekenHuurprijs());
    }
}
