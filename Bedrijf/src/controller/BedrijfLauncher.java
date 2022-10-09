package controller;

import model.Afdeling;
import model.Persoon;
import model.Werknemer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BedrijfLauncher {
    public static void main(String[] args) {
//        System.out.println(Persoon.aantalPersonen);
//        Persoon baas = new Persoon("Mark", "Den haag", 10000.00);
//        System.out.println(Persoon.aantalPersonen);
//        System.out.println(baas.getPersoneelsNummer());
//        Persoon medewerker = new Persoon("Caroline", "Delft", 4000.00);
//        System.out.println(Persoon.aantalPersonen);
//        System.out.println(medewerker.getPersoneelsNummer());
//
//        Persoon assistent = new Persoon("Klaas");
//        Persoon manager = new Persoon();
//        System.out.println(Persoon.aantalPersonen);
//        System.out.printf("%4s verdient %8.2f en heeft %4s recht op een bonus.\n"
//                , baas.getNaam(), baas.getMaandSalaris(), baas.heeftRechtOpBonus());
//        System.out.printf("%8s verdient %8.2f en heeft %4s recht op een bonus.\n"
//                , medewerker.getNaam(), medewerker.getMaandSalaris(), medewerker.heeftRechtOpBonus());

//        Afdeling[] afdelingen = new Afdeling[4];
//        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
//        afdelingen[1] = new Afdeling("Support", "Amsterdam");
//        afdelingen[2] = new Afdeling("Management", "Almere");
//        afdelingen[3] = new Afdeling("Documentatie", "Gouda");
//
//        ArrayList<Persoon> personen = new ArrayList<>();
//        personen.add(new Werknemer("Mark", "Den Haag", afdelingen[2], 10000));
//        personen.add(new Werknemer("Angelique", "Rotterdam", afdelingen[2], 4000));
//        personen.add(new Werknemer("Caroline", "Delft", afdelingen[1], 4000));
//        personen.add(new Zzper("Klaas", "Diemen", afdelingen[3], 50.00));
//        personen.add(new Zzper("Ronald", "Zaandam", afdelingen[0], 80));
//        personen.add(new Zzper("Jannie", "Utrecht", afdelingen[0], 60.00));
//        personen.add(new Zzper("Anne", "Zwolle", afdelingen[0], 40.00));
//        personen.add(new Vrijwilliger("Ambi", "Amsterdam", afdelingen[0]));
//        personen.add(new Vrijwilliger("Naledi", "Gaborone", afdelingen[1]));
//        personen.add(new Vrijwilliger("Ceren", "Istanboel", afdelingen[2]));
//        personen.add(new Vrijwilliger("Haining", "Shaoxing", afdelingen[3]));
//
//        for (Persoon persoon : personen) {
//            if (persoon instanceof Zzper) {
//                ((Zzper) persoon).huurIn(320);
//            }
//        }
//        for (Persoon persoon:personen) {
//            if(persoon instanceof Vrijwilliger){
//                ((Vrijwilliger)persoon).huurIn(160);
//            }
//        }
//        Collections.sort(personen);
//        for (Persoon persoon:personen) {
//            System.out.println(persoon);
//            toonJaarInkomen(persoon);
//        }

//        Werknemer baas = new Werknemer("Mark", "Den Haag",  afdelingen[2],10000);
//        Werknemer medewerker = new Werknemer("Caroline", "Delft",afdelingen[1],4000);
//        Zzper assistent = new Zzper("Klaas","Diemen",afdelingen[3],50.00);
//        assistent.huurIn(160);
//        Zzper projectleider = new Zzper("Ronald","Zaandam",afdelingen[0],80);
//        projectleider.huurIn(320);
//
//        Persoon[]personen=new Persoon[4];
//        personen[0] = baas;
//        personen[1] = medewerker;
//        personen[2]= assistent;
//        personen[3]=projectleider;
//
//        System.out.println("Het aantal personen in het bedrijf is " + Persoon.aantalPersonen);
//        System.out.println(baas);
//        System.out.println(medewerker);
//        System.out.println(assistent);
//        for (Persoon persoon:personen) {
//            toonJaarInkomen(persoon);
//            System.out.println();
//        }
//
//        System.out.println(String.format("%s verdient %.2f per jaar",baas.getNaam(),baas.berekenJaarInkomen()));
//        System.out.println(String.format("%s verdient %.2f per jaar",medewerker.getNaam(),medewerker.berekenJaarInkomen()));
//        System.out.println(String.format("%s verdient %.2f per jaar",assistent.getNaam(),assistent.berekenJaarInkomen()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de naam:");
        String naam = scanner.nextLine();
        System.out.println(" Geef de woonplaats:");
        String woonplaats = scanner.nextLine();
        System.out.println("Geef de naam van de afdeling:");
        String afdelingNaam = scanner.nextLine();
        System.out.println("Geef de plaats van de afdeling:");
        String afdelingPlaats = scanner.nextLine();

        boolean onjuistInvoer = true;
        while (onjuistInvoer) {
            System.out.println("Geef het maandsalaris:");
            double maandSalaris = scanner.nextDouble();
            try {
                Werknemer werknemer = new Werknemer(naam, woonplaats, new Afdeling(afdelingNaam, afdelingPlaats), maandSalaris);
                System.out.println(werknemer);
                onjuistInvoer = false;
            } catch (IllegalArgumentException fout) {
                System.out.println(fout.getMessage());
            } finally {
                System.out.println("Je invoer is op de juiste wijze afgehandeld.");
                System.out.println();
            }
        }
        ArrayList<Afdeling> afdelingen = new ArrayList<>();
        File AfdelingBestand = new File("resources/Afdelingen.txt");

        try {
            Scanner invoer = new Scanner(AfdelingBestand);
            while (invoer.hasNextLine()) {
                String afdelingsNaam = invoer.nextLine();
                String afdelingsPlaats = invoer.nextLine();
                afdelingen.add(new Afdeling(afdelingsNaam, afdelingsPlaats));
            }
        } catch (FileNotFoundException nietGevonden) {
            System.out.println("Bestand niet gevonden");
        }

    }

    ArrayList<Persoon> personen = new ArrayList<>();
    File PersoonBestand = new File("resources/Presonen.csv");

}

//        Geef het maandsalaris: 2300
//        Antoinette woont in Leeuwarden en werkt op afdeling IT te Groningen en is
//        een werknemer zonder recht op een bonus
//        Je invoer is op de juiste wijze afgehandeld.
//    }
//
//    public static void toonJaarInkomen(Persoon persoon) {
//        System.out.printf("%s verdient %.2f per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
//    }
//}