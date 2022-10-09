//package model;
//
//import java.time.LocalDate;
//
//public class OpenSession extends Session {
//    public static final int OPENSESSION_STANDAARD_KOSTEN = 12;
//    public static final int STANDAARD_DUUR = 3;
//    private int aantalLuisteraars;
//    private int maximumAantalMuzikanten;
//
//    public OpenSession(Muzikant organisator, LocalDate datum, double duur, boolean opgenomen, int aantalLuisteraars, int maximumAantalMuzikanten) {
//        super(organisator, datum, STANDAARD_DUUR, true);
//        this.aantalLuisteraars = aantalLuisteraars;
//        this.maximumAantalMuzikanten = maximumAantalMuzikanten;
//    }
//
//    @Override
//    public double berekenKosten() {
//        if (aantalLuisteraars < 100) {
//            return OPENSESSION_STANDAARD_KOSTEN * 1.5;
//        } else {
//            return OPENSESSION_STANDAARD_KOSTEN;
//        }
//    }
//    public String toString() {
//        String opgenomenText;
//        if (opgenomen) {
//            opgenomenText = "";
//        } else {
//            opgenomenText = "(geen opname)";
//        }
//        return String.format("Session op %s van %.1f uur %s \n\t Organisator:%s\t" +
//                        " Maximaal %d muzikanten\n\t Kosten: %.2f met %d luisteraars\n",
//                datum, duur, opgenomenText,organisator,maximumAantalMuzikanten, berekenKosten(),aantalLuisteraars);
//    }
//
//    @Override
//    public int compareTo(Session o) {
//        return 0;
//    }
//}
