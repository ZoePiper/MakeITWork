package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Verhuur {
    private Klant klant;

    private List<Boot>boten;
    private LocalDate startDatum;
    private int aantalDagen;

    public Verhuur(Klant klant, LocalDate datum, int aantalDagen) {
        this.klant = klant;
        this.startDatum = datum;
        this.aantalDagen = aantalDagen;
        boten = new ArrayList<>();
    }

    public void voegBootToe(Boot boot) {
        if (magVerhuurd(boot)) {
            boten.add(boot);
        } else {
            System.out.println((boot + "Mag niet verhuurd worden\n"));
        }
    }

    public double berekenHuurBedrag() {
        double totaalPrijsBoten=0.0;
        for( Boot boot : boten){
            totaalPrijsBoten+=boot.berekenHuurprijs();
        }return aantalDagen*totaalPrijsBoten;
    }

    private boolean magVerhuurd(Boot boot) {
      return !boot.isVaarbewijsPlichtig() || klant.isVaarVaardig();
    }
    @Override
    public String toString(){
        Collections.sort(boten);
        StringBuilder result = new StringBuilder();
        result.append(String.format("De verhuur aan %s", klant));
        if (boten.isEmpty()) {
            result.append(String.format(" op %s is mislukt, geen boten toegevoegd.\n", startDatum));
        }else{
            result.append(String.format(" van %s tot %s kost %.2f euro:\n",
                    startDatum, startDatum.plusDays(aantalDagen - 1), berekenHuurBedrag()));
            for (Boot boot : boten){
                result.append(boot + "\n");
            }
        }return result.toString();
    }

}
