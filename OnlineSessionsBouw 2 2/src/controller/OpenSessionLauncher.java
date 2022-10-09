package controller;
//Zoe Piper
import model.Agenda;
import model.GeslotenSession;
import model.Muzikant;
import model.OpenSession;

import java.time.LocalDate;

public class OpenSessionLauncher {
    public static void main(String[] args) {

        System.out.println("Welkom bij de laatse toets van de eerste fase van Make IT Work. " +
                "Van Zoe Piper nr 4988426\n");
        /*Geef een welkomstboodschap met je naam en studentnummer
        2. Laat zien dat een session een foutmelding geeft als de duur te lang is.
        3. Laat zien dat een gesloten session een foutmelding geeft als het aantal muzikanten te hoog of te laag is.
        4. Laat zien dat een session niet toegevoegd wordt aan een agenda als de session in de verkeerde maand en/of jaar is.
        5. Laat zien dat alle toString() methodes goed geïmplementeerd zijn.*/


//Klasse muzikant Main
        Muzikant muzikant1 = new Muzikant("Sting", "bas",34);
        System.out.println(muzikant1);

        //Abstracte klasse session
        Muzikant paul = new Muzikant("Paul Weller","gitaar",23);
        GeslotenSession session1 = new GeslotenSession(new Muzikant("sting","bas",34),
                LocalDate.parse("2020-04-16"),1.5,true,5);
        GeslotenSession session2 = new GeslotenSession(new Muzikant("Paul Weller","gitaar",23),
                LocalDate.parse("2020-04-25"),1.0,false,2);
        System.out.println(session1);
        System.out.println(session2);

        // Fout melding duur langer dan 4 uur
        GeslotenSession session3 = new GeslotenSession(muzikant1,LocalDate.now(),5,true,5);
        session3.setDuur(7);

        //Test datum
        System.out.println(session3.getDatum());
        System.out.println(session2.getDatum());

        //Test compareTo
        System.out.println(session1.compareTo(session2));

//        //test aantal muzikanten. fout melding onder 1 en boven 10
//        System.out.println(session1.setAantalMuzikanten(-6));
//        System.out.println(session2.setAantalMuzikanten(20));

        //  test berekenkosten
        System.out.println(session1.berekenKosten());
        System.out.println(session2.berekenKosten());

        //Statement GeslotenSession
        System.out.println(session1);
        System.out.println(session2);
//Statement Opensession
        OpenSession session4 = new OpenSession(muzikant1,LocalDate.parse("2020-04-06"),3,true,80,5);
        System.out.println(session4);


//       Statement Agenda
        Agenda a1 =new Agenda(04,2020);
        OpenSession session6 = new OpenSession(paul,LocalDate.parse("2020-05-06"),3,true,80,5);
        a1.toString();
        a1.voegSessionToe(session6);
        System.out.println(a1);
    }
}
