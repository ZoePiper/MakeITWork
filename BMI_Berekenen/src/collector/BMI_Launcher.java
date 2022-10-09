package collector;
/*@zoepiper
        BMI = Gewicht in kilogram / (Lengte in meter * Lengte in meter)

* 30 min*/

import java.util.Scanner;

public class BMI_Launcher {
    public static void main(String[] args) {

        // BMI = Gewicht in kilogram / (Lengte in meter * Lengte in meter)
        // Vraag lengte in cm
        Scanner input = new Scanner(System.in);
        System.out.println(" Voer in je lengte in cm");
        int lengteInCm = input.nextInt();
        input.nextLine();

        // Maak cm naar meters
        double lengteInMeter = lengteInCm / 100.0;

        //vraag gewicht
        System.out.println(" Voer in je gewicht");
        double gewicht = input.nextDouble();
        input.nextLine();

        //bereken bmi
        double berekenBmi = gewicht / (lengteInMeter * lengteInMeter);

        // resultaat
        if (berekenBmi > 25) {
            System.out.println("Je bent dik :(");
        } else {
            System.out.println("Je bent goed op gewicht ");
        }

        // bmi weergeven
        System.out.println(" Jouw bmi is " + Math.round(berekenBmi));



    }
}
