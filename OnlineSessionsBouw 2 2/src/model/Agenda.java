package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Agenda {
    private ArrayList<Session> sessions;
    private int maand;
    private int jaar;

    public Agenda(int maand, int jaar) {
        this.maand = maand;
        this.jaar = jaar;
        sessions = new ArrayList<>();
    }



    public void voegSessionToe(Session session) {
        if (session.getDatum().getMonthValue() == maand && session.getDatum().getYear() == jaar) {
            sessions.add(session);
            System.out.println("Session toegevoegd");
        } else {
            System.out.println("Deze session wordt niet toegevoegd, verkeerde maand en/of jaar!");
        }
    }

    @Override
    public String toString() {
        String sessionString = "";
        Collections.sort(sessions);
        for (Session session : sessions) {
            sessionString += session.toString() + "\n\n";
        }
        return sessionString;
    }
}

