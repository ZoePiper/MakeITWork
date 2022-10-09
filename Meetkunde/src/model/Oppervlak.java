package model;

import java.util.ArrayList;
import java.util.Collections;

public class Oppervlak {
    private double lengte;
    private double breedte;
    private ArrayList<Figuur> mijnFiguren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        mijnFiguren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        if (figuur.pastInOppervlak(lengte, breedte)) {
            mijnFiguren.add(figuur);
            System.out.println("Je figuur is toegevoegd");
        } else {
            System.out.println("Je figuur past niet.");
        }
    }


    public ArrayList<Figuur> getMijnFiguren() {
        return mijnFiguren;
    }


    public void setMijnFiguren(ArrayList<Figuur> mijnFiguren) {
        this.mijnFiguren = mijnFiguren;
    }

    public ArrayList<Figuur> geefFigurenMetGrotereOppervlakte(double grenswaarde) {
        ArrayList<Figuur> gevraagdeFiguren = new ArrayList<>();
        for (Figuur figuur : mijnFiguren) {
            if (figuur.geefOppervlakte() > grenswaarde) {
                gevraagdeFiguren.add(figuur);
            }
        }
        return gevraagdeFiguren;
    }
    @Override
    public String toString() {
        StringBuilder eenReturn = new StringBuilder();
        Collections.sort(mijnFiguren);
        for (Figuur figuur : mijnFiguren) {
            eenReturn.append(String.format("%s\n\n",figuur.toString()));
        }
        return eenReturn.toString();
    }

}