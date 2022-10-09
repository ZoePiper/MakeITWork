package model;

public class Rechthoek extends Figuur {
    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        super(kleur);
            if (lengte <= 0) {
                throw new IllegalArgumentException("De straal moet positief zijn. De straal wordt op 1 gezet");
            }
        this.lengte = lengte;
        if (breedte <= 0) {
            throw new IllegalArgumentException("De straal moet positief zijn. De straal wordt op 1 gezet");
        }
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), DEFAULTWAARDE_KLEUR);
    }

    public Rechthoek() {
        this(2, 1);
    }


    //static methode
    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken";
    }

    // instantiate
    @Override
    public double geefOmtrek() {
        return 2 * (lengte + breedte);
    }

    @Override
    public double geefOppervlakte() {
        return lengte * breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte)
        throws IllegalArgumentException {
            if (lengte <= 0) {
                throw new IllegalArgumentException("De straal moet positief zijn. De straal wordt op 1 gezet");
            }
            this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte)
        throws IllegalArgumentException{
    if (breedte <= 0) {
            throw new IllegalArgumentException("De straal moet positief zijn. De straal wordt op 1 gezet");
        }
        this.breedte = breedte;this.breedte = breedte;
    }

    public Punt getHoekpuntLinksBoven() {
        return hoekpuntLinksBoven;
    }

    public void setHoekpuntLinksBoven(Punt hoekpuntLinksBoven) {
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }
    @Override
    public String toString() {
        return super.toString() + "\nLengte: " + lengte + "\nBreedte: " +
                breedte + "\nHoekpunt: " + hoekpuntLinksBoven.toString();
    }
    @Override
    public boolean pastInOppervlak(double lengte, double breedte){
        return this.lengte<= lengte && this.breedte<=breedte;
    }

}
