package Model;

public class ZeilBoot extends Boot {
    private final static int PRIJS_GRENS = 7;
    private final static double PRIJS_LAAG = 40.0;
    private final static double PRIJS_HOOG = 70.0;
    private final static int LENGTE_GRENS = 15;
    public ZeilBoot(String naam, int lengte) {
        super(naam, lengte);
    }
    public boolean isVaarbewijsPlichtig() {
        return getLengte() > LENGTE_GRENS;
    }
    public double berekenHuurprijs() {
        double huurprijs;
        if (getLengte() < PRIJS_GRENS) {
            huurprijs = PRIJS_LAAG;
        } else {
            huurprijs = PRIJS_HOOG;
        }
        return huurprijs;
    }


    public String toString(){
        String vaarBewijsPlichtig;
        if (isVaarbewijsPlichtig()) {
            vaarBewijsPlichtig= "Ja";
        }else{
            vaarBewijsPlichtig="nee";
        }
        return String.format("Zeilboot %s \n\t" +
                "Vaarbewijs vereist:%s\n\t Huurprijs: %.2f euro.\n",
                super.toString(), vaarBewijsPlichtig, berekenHuurprijs());
    }
}
