package model;

import java.time.LocalDate;

public class GeslotenSession extends Session {

    public static final int DEFAULT_BASIS_BEDRAG = 5;
    public static final int STANDAARD_DUUR = 1;
    public static final double EXTRA_KOSTEN = 2.50;
    private int aantalMuzikanten;

    public GeslotenSession(Muzikant organisator, LocalDate datum, double duur, boolean opgenomen, int aantalMuzikanten) {
        super(organisator, datum, duur, opgenomen);
        this.aantalMuzikanten = aantalMuzikanten;

    }
//TODO
//    public GeslotenSession(Muzikant organisator, int aantalMuzikanten) {
//        super(organisator);
//    }

    public int getAantalMuzikanten() {
        return aantalMuzikanten;
    }

    public int setAantalMuzikanten(int aantalMuzikanten) {
        if (aantalMuzikanten < 1 || aantalMuzikanten > 10) {
            System.out.println(" Het aantal deelnemers moet minimaal 1 zijn! respectievelijk Het aantal deelnemers mag maximaal 10 zijn!");
            return 1;
        }
        return aantalMuzikanten;
    }

    //@Override
    public double berekenKosten() {
        double kosten = 0.0;
        if (duur > STANDAARD_DUUR) {
            double extraBetalen = ((duur * 2) - (STANDAARD_DUUR * 2)) * EXTRA_KOSTEN;
            kosten = (extraBetalen + DEFAULT_BASIS_BEDRAG) * aantalMuzikanten;
            if (opgenomen) {
                return kosten * 1.5;
            }
        }else {
                kosten = DEFAULT_BASIS_BEDRAG * aantalMuzikanten;
                if (opgenomen) {
                    return kosten * 1.5;
                }
            } return kosten;
        }


    public String toString() {
        String opgenomenText;
        if (opgenomen) {
            opgenomenText = "";
        } else {
            opgenomenText = "(geen opname)";
        }
        return String.format("Session op %s van %.1f uur %s \n\t Organisator:%s\t" +
                        " Kosten: %.2f voor %d muzikanten\n",
                datum, duur, opgenomenText, organisator, berekenKosten(), aantalMuzikanten);
    }

    @Override
    public int compareTo(Session o) {
        return 0;
    }
}
