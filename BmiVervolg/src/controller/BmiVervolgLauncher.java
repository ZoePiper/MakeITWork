package controller;
/*@zoepiper
 * probleem: decimalen maken met math.round*/

import java.util.Scanner;

public class BmiVervolgLauncher {

    public static final double ONDERGEWICHT = 18.5;
    public static final int GEZOND_GEWICHT = 25;
    public static final int OVERGEWICHT = 30;

    public static void main(String[] args) {
        //        BMI = Gewicht in kilogram / (Lengte in meter * Lengte in meter)
        // Vraag lengte in cm
        Scanner input = new Scanner(System.in);
        System.out.println("Voer in je lengte in cm");
        int lengteInCm = input.nextInt();
        input.nextLine();

        // Maak cm naar meters
        double lengteInMeter = lengteInCm / 100.0;

        //vraag gewicht
        System.out.println("Voer in je gewicht");
        double gewicht = input.nextDouble();
        input.nextLine();

        //bereken bmi
        // resultaat
        double resultaatBMI = berekenBMI(lengteInMeter, gewicht);


        // bmi weergeven
        System.out.print("Jouw bmi is " + resultaatBMI );
        bepaalCategorie(resultaatBMI);

    }

    //bereken de BMI
    public static double berekenBMI(double mpLengte, double mpGewicht) {
double doubleLength =Math.pow(mpLengte, 2);
        return Math.round(10 * mpGewicht / doubleLength) / 10.0;
        // 69,6> 696 / 3,0625 =227,26 > round > 227 / 10.0 = 22,7 making a decimal
    }

    //gezondheid bepalen
    public static void bepaalCategorie(double mpBmi) {
        if (mpBmi < ONDERGEWICHT) {
            System.out.print("(Ondergewicht)");
        } else if (mpBmi < GEZOND_GEWICHT) {
            System.out.print("(gezond gewicht) ");
        } else if (mpBmi < OVERGEWICHT) {
            System.out.print("(overgewicht)");
        } else {
            System.out.print("(Obesitas)");
        }
    }
}