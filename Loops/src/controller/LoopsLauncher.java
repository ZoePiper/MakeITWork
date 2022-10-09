package controller;

import java.util.Scanner;

/*@Zoepiper
 * let op charAt(0)
 */
public class LoopsLauncher {
    public static void main(String[] args) {

        //Sterrenrij
        //een methode die een gegeven aantal asterisken print.
        toonRijSterren(5);
        System.out.println();

        //Sterrenvierkant
        toonVierkantSterren(8);
        System.out.println();

        //Karakter rij
        // Voer in een karakter en aantal om te herhalen
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welk karakter wil je dit keer gebruiken? ");
        char karakter = scanner.next().charAt(0);
        System.out.println("Hoe vaak wil je het zien? ");
        int aantal = scanner.nextInt();
        toonCharRij(karakter, aantal);

        //Optellen tot aan 1000
        telAlleIntegersOpTotSomDuizend();

        // Grens van optellen aangeven
        System.out.println("Tot hoeveel wil je optellen? ");
        int grens = scanner.nextInt();
        System.out.printf("De eerste %d getallen bij elkaar zijn net geen %d", telAantalTeSommerenGetallen(grens), grens);

    } //End main

    public static void toonRijSterren(int mpAantal) {
        for (int i = 0; i < mpAantal; i++) {
            System.out.print(" * ");
        }
    }

    //Sterrenvierkant
    // repeat methode
    public static void toonVierkantSterren(int mpAantal) {
        for (int i = 0; i < mpAantal; i++) {
            toonRijSterren(mpAantal);
            System.out.println();
        }
    }

    //Karakter rij
    public static void toonCharRij(char karakter, int aantal) {
        for (int i = 0; i < aantal; i++) {
            System.out.print(karakter);
            System.out.println();
        }
    }

    public static void telAlleIntegersOpTotSomDuizend() {
        int getal = 1;
        int som = 0;
        while (som < 1000) {
            som += getal;
            getal++;
        }
        System.out.println(som);
        System.out.println(getal - 1);
    }

    //Optellen tot aan 1000
    public static int telAantalTeSommerenGetallen(int grens) {
        int getal = 0;
        int som = 0;
        while (som < grens) {
            getal++;
            som += getal;
        }
        return getal - 1;
    }
}





