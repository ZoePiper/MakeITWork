package controller;

import model.Verbruik;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SimOnlyLauncher {
    public static void main(String[] args) {
     Verbruik nr1 = new Verbruik("aug",4563);
        Verbruik nr2 = new Verbruik("okt",2134);

        System.out.println(nr1.toonVerbruik());
        System.out.println(nr1.berekenKosten());
        System.out.println(nr2.toonVerbruik());
        System.out.println(nr2.berekenKosten());

        Scanner scanner = new Scanner(System.in);

        Verbruik[] Verbruiken = new Verbruik[4];
        Verbruiken[0] = new Verbruik("juli");
        Verbruiken[1]= new Verbruik("aug");
        Verbruiken[2]= new Verbruik("sept");
        Verbruiken[3]= new Verbruik("okt");

        for (int i = 0; i < 4; i++) {
           System.out.println("Geef je dataverbruik voor per maand :");
           System.out.println(Verbruiken[i].getMaand()+ ": ");
           Verbruiken[i].setHoeveelheidMb(scanner.nextInt());

           System.out.println(Verbruiken[i].berekenKosten());
           System.out.println(Verbruiken[i].toonVerbruik());

        }
}}
