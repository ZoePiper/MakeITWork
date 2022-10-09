package controller;

import java.util.Scanner;

public class GeldWisselen {
    private static final double OMREKENKOERS_EURO_DOLLAR = 1.0034;

    public static void main(String[] args) {

        //Vraag de gebruiker hoeveel euro's hij om wil wisselen
        System.out.println("Voer euros in");

        //Lees het aantal in
        Scanner input = new Scanner(System.in);
        double euro = input.nextDouble();

        //berekenen aantal dollars
        double koersWissel = euro * OMREKENKOERS_EURO_DOLLAR;

        //geef berekening in dollars weer
        System.out.println(euro + " euro's is " + OMREKENKOERS_EURO_DOLLAR +" dollars");
    }

}
