package controller;
/*@zoepiper
 * 30min
 * Schrijf een applicatie die de verkoopprijs berekent van een product.
 * De verkoopprijs wordt berekend op basis van de inkoopprijs van een
 * product en de winstmarge.1*/


import java.lang.invoke.SwitchPoint;
import java.util.Scanner;



public class VerkoopPrijsLauncher {
    private static final double BTWHOOG = 1.21;
    private static final double BTWLAAG = 1.06;

    public static void main(String[] args) {
       // double test = Math.round(98.51819999999998 *100)/100.0 ;
        //System.out.println(test);

        Scanner input = new Scanner(System.in);

        //input Inkoopprijs: 70,80
        System.out.println("Voer de inkoopprijs in: ");
        double inkoopPrijs = input.nextDouble();
        input.nextLine();

        // input Winstmarge gehele getal(in %): 15
        System.out.println("Voer de winst marge in percent");
        int winstMarge = input.nextInt();
        input.nextLine();

        double percentage = winstMarge / 100.0;
        System.out.println(percentage);

        //
        // Verkoopprijs exclusief BTW : 81.42
        double verkoopPrijs = inkoopPrijs * (1 + percentage);
        double afrondenVerkoopPrijs = Math.round(verkoopPrijs *100)/100.0 ;

        System.out.println(verkoopPrijs);
        System.out.println("Je verkoopprijs exclusie BTW is " + afrondenVerkoopPrijs);


        // Onder welk BTW-tarief valt het product?
        // 1 Hoog 2 Laag
        // Geef je keuze: 1
        System.out.println("Onder welk BTW-tarief valt het product?\n1.Hoog\n2.Laag \n Geef je keuze");
        int keuzeBtw = input.nextInt();
        switch (keuzeBtw) {
            case 1:
                System.out.println(Math.round(afrondenVerkoopPrijs * BTWHOOG *100)/100);
                break;
            case 2:
                System.out.println(Math.round(afrondenVerkoopPrijs * BTWLAAG *100)/100);
                break;
            default:
                System.out.println("Probeer het nogmaals");

        }


        // resultaat Verkoopprijs inclusief 21% BTW: 98.51819999999998
    }

}
