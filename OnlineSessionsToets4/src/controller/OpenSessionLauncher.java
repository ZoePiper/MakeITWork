package controller;
//Zoe Piper

import database.AbstractDAO;
import database.DBaccess;
import database.MuzikantDAO;
import model.Agenda;
import model.GeslotenSession;
import model.Muzikant;
import model.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class OpenSessionLauncher {
    private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String PREFIX_CONNECTION_URL =
            "jdbc:mysql://localhost:3306/";
    private static final String CONNECTION_SETTINGS = "?useSSL=false" +
            "&allowPublicKeyRetrieval=true" +
            "&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false" +
            "&serverTimezone=UTC";

    public static void main(String[] args) {
        DBaccess dBaccess = new DBaccess("OnlineSession", "root",
                "#C7b3rDuck7");
        dBaccess.openConnection();
        Connection connection = dBaccess.getConnection();

      //  Test Foutmelding Statement Agenda
        Agenda a1 =new Agenda(04,2020);
        Muzikant paul = new Muzikant("Paul Weller","gitaar",23);
        GeslotenSession session10 = new GeslotenSession(1, paul,LocalDate.parse("2020-05-06"),3,true,80);
        a1.toString();
        a1.voegSessionToe(session10);
        System.out.println(a1);
//
//        Scanner invoer = new Scanner(System.in);
//        boolean onjuisteInvoer = true;
//        while (onjuisteInvoer) {
//            System.out.print("Geef een maand: ");
//            int maand = invoer.nextInt();
//            System.out.print("Geef een jaar: ");
//            int jaar = invoer.nextInt();
//            try {
//                Agenda ingevoerdeAgenda = new Agenda(maand,jaar);
//                ingevoerdeAgenda.voegSessionToe(session10);
//                onjuisteInvoer = false;
//            } catch (IllegalArgumentException fout) {
//                System.out.println(fout.getMessage());
//            } finally {
//                System.out.println("Je invoer is op de juiste wijze afgehandeld. Voor een juiste datum in");
//            }
//        }
        //Agenda Minimum
        GeslotenSession session11 = new GeslotenSession(1, paul,LocalDate.parse("2020-04-06"),3,true,2);
        Agenda agenda = new Agenda();
        agenda.printGeslotenSessions(3);


//Klasse MuzikantDAO >>test

        // slaMuzikantOp
        MuzikantDAO muzikantDAO = new MuzikantDAO(dBaccess);
        muzikantDAO.slaOpMuzikant(new Muzikant("Adele", "zang", 12));

        // Haalt alle Muzikant records op
        System.out.println("Alle records ophalen van Muzikanten");
        ArrayList<Muzikant> muzikantlijst = muzikantDAO.getMuzikanten();
        for (Muzikant muzikant1 : muzikantlijst) {
            System.out.println(muzikant1);
        }
//
//        //SessionDao
//        GeslotenSession geslotenSession = new GeslotenSession(super);
//        geslotenSession (new GeslotenSession(1,"Bart","2022-03-01", 3, false,);
//
//
//
//        //inlezen
//        String sql = "SELECT * FROM muzikant;";
//        try {
//            PreparedStatement preparedStatement =
//                    connection.prepareStatement(sql);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                String naam = resultSet.getString("naam");
//                String instrument = resultSet.getString("instrument");
//                int jaarErvaring = resultSet.getInt("jaarErvaring");
//                System.out.printf("(%s,%s, %d)\n", naam,instrument, jaarErvaring);
//            }
//        } catch (SQLException fouteSQL) {
//            System.out.println(fouteSQL);
//        }
//

//        ----test data ---
//        System.out.println("Welkom bij de laatse toets van de eerste fase van Make IT Work. " +
//                "Van Zoe Piper nr 4988426\n");
//        /*Geef een welkomstboodschap met je naam en studentnummer
//        2. Laat zien dat een session een foutmelding geeft als de duur te lang is.
//        3. Laat zien dat een gesloten session een foutmelding geeft als het aantal muzikanten te hoog of te laag is.
//        4. Laat zien dat een session niet toegevoegd wordt aan een agenda als de session in de verkeerde maand en/of jaar is.
//        5. Laat zien dat alle toString() methodes goed geïmplementeerd zijn.*/
//
//
////Klasse muzikant Main
//        Muzikant muzikant1 = new Muzikant("Sting", "bas",34);
//        System.out.println(muzikant1);
//
//        //Abstracte klasse session
//        Muzikant paul = new Muzikant("Paul Weller","gitaar",23);
//        GeslotenSession session1 = new GeslotenSession(new Muzikant("sting","bas",34),
//                LocalDate.parse("2020-04-16"),1.5,true,5);
//        GeslotenSession session2 = new GeslotenSession(new Muzikant("Paul Weller","gitaar",23),
//                LocalDate.parse("2020-04-25"),1.0,false,2);
//        System.out.println(session1);
//        System.out.println(session2);
//
//        // Fout melding duur langer dan 4 uur
//        GeslotenSession session3 = new GeslotenSession(muzikant1,LocalDate.now(),5,true,5);
//        session3.setDuur(7);
//
//        //Test datum
//        System.out.println(session3.getDatum());
//        System.out.println(session2.getDatum());
//
//        //Test compareTo
//        System.out.println(session1.compareTo(session2));
//
////        //test aantal muzikanten. fout melding onder 1 en boven 10
////        System.out.println(session1.setAantalMuzikanten(-6));
////        System.out.println(session2.setAantalMuzikanten(20));
//
//        //  test berekenkosten
//        System.out.println(session1.berekenKosten());
//        System.out.println(session2.berekenKosten());
//
//        //Statement GeslotenSession
//        System.out.println(session1);
//        System.out.println(session2);
////Statement Opensession
//        OpenSession session4 = new OpenSession(muzikant1,LocalDate.parse("2020-04-06"),3,true,80,5);
//        System.out.println(session4);
//
//
////       Statement Agenda
//        Agenda a1 =new Agenda(04,2020);
//        OpenSession session6 = new OpenSession(paul,LocalDate.parse("2020-05-06"),3,true,80,5);
//        a1.toString();
//        a1.voegSessionToe(session6);
//        System.out.println(a1);

    }
}
