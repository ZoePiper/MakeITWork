/*10:38*/

import java.util.Scanner;

public class Tafels {
    public static void main(String[] args) {
       //input
        Scanner input = new Scanner(System.in);
        System.out.println("Welke tafel wilt u afdrukken?");
        int getal = input.nextInt();

        //bevestiging van getal
        System.out.println("De tafel van "+ getal + " : ");

        //output
        // t/m 10
        int i = 1;
        while (i < 10){
            System.out.print(i*getal);
            i++;
        }
// 5 getallen op een rij getoond worden,System.out.printf.
// Hiermee kun je precies aangeven hoeveel posities een integer moet innemen.
        //remainder operator (%) om te bepalen wanneer er 5
        //Hoeveel getallen wilt u afdrukken? 12,
        // vaaker kunnen invoeren,nested loops
        //stopt pas wanneer voor de tafel van 0

    }
}