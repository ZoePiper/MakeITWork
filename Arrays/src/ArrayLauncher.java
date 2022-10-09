import java.util.Arrays;
import java.util.Scanner;

public class ArrayLauncher {
    /*@zoepiper
     * 9:55
     * import Arrays om cijfers uit te kunnen printen*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input - Hoeveel getallen wil je genereren? mpAantal
        System.out.println("Hoeveel getallen wil je genereren?");
        int mpAantal = scanner.nextInt();

        //input  - Wat is het grootste getal dat mag voorkomen? mpMaximum
        System.out.println("Wat is het grootste getal dat mag voorkomen?");
        int mpMaximum = scanner.nextInt();

        //process
        int[] listRandomNumbers = maakRandomRijGetallen(mpAantal, mpMaximum);

        //output - Dit zijn de getallen:
        System.out.println("Dit zijn de getallen: " + Arrays.toString(listRandomNumbers));

    }

    //Maak methode

    //for loop terugeven
    public static int[] maakRandomRijGetallen(int mpAantal, int mpMaximum) {
        // Maak een array
        int[] list = new int[mpAantal];

        for (int i = 0; i < mpAantal; i++) {
            list[i] = makeRandomNumber(mpMaximum);
        }
        return list;
    }
    // vullen random getalen van 1 tot maxMaximum
    public static int makeRandomNumber(int mpMaximum) {
        return (int) (Math.random() * mpMaximum) ;
    }
}


