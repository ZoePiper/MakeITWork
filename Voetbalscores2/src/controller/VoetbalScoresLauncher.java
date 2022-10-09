package controller;
//14:19

import model.Team;
import model.Wedstrijd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VoetbalScoresLauncher {
    public static void main(String[] args) {
        Team team1 = new Team("Twente", 15, 28, 12);
        team1.printStatusTeam();

        Team team2 = new Team("Ajax");
        Team team3 = new Team("Pec");
        Wedstrijd wedstrijdFrankrijk = new Wedstrijd(team2, team3, 5, 0);
        wedstrijdFrankrijk.printUitslag();
        wedstrijdFrankrijk.printWedstrijdPunten();
        System.out.println();


        Team[] teams = new Team[3];
        teams[0] = new Team("Ajax");
        teams[1] = new Team("Psv");
        teams[2] = new Team("Willem2");

        Wedstrijd[]wedstrijden =new Wedstrijd[6];
        wedstrijden[0] = new Wedstrijd(teams[0],teams[1]);
        wedstrijden[1] = new Wedstrijd(teams[0],teams[2]);
        wedstrijden[2] = new Wedstrijd(teams[1],teams[0]);
        wedstrijden[3] = new Wedstrijd(teams[1],teams[2]);
        wedstrijden[4] = new Wedstrijd(teams[2],teams[0]);
        wedstrijden[5] = new Wedstrijd(teams[2],teams[1]);

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < wedstrijden.length; i++) {
            System.out.print("Geef van de wedstrijd " + wedstrijden[i].getThuisTeam().getTeamNaam()
                    + "-" + wedstrijden[i].getUitTeam().getTeamNaam() + " de thuisdoelpunten: ");

            wedstrijden[i].setThuisDoelPunten(input.nextInt());
            System.out.print("Geef van de wedstrijd " + wedstrijden[i].getThuisTeam().getTeamNaam() + "-" +
                    wedstrijden[i].getUitTeam().getTeamNaam() + " de uitdoelpunten: ");
            wedstrijden[i].setUitDoelpunten(input.nextInt());
            System.out.println();
        }

        for (int i = 0; i < wedstrijden.length; i++) {
            wedstrijden[i].printUitslag();
            wedstrijden[i].setWedstrijdPuntenThuisTeam();
            wedstrijden[i].setWedstrijdPuntenUitTeam();
            wedstrijden[i].setTotaalDoelpuntenTeams();
        }
        for (int i = 0; i < teams.length; i++) {
            teams[i].printStatusTeam();
        }


    }
}
