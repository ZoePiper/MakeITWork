import java.util.Scanner;

public class VertemenigvuldigenLauncher {
    public static void main(String[] args) {

        //Gebruiker krijgt een som (bijvoorbeeld 9 x 3)
        // maak 2 random getallen om te vermenigvuldigen
        // hoe maak ik 1 random getal?
        // random ophalen [0.0 .. 1.0)
        // ..
        // double vertalen naar ints
        // .. beetjw wiskunde, iets met casten of afronden.
        // toon string met te maken som
        int getal1 = (int) (Math.random() * 10);
        int getal2 = (int) (Math.random() * 10);
        System.out.println("Wat is het antwoord van " + getal1 + " x " + getal2 + "?");


        //Gebruiker geeft een antwoord
        // inlezen van het antwoord
        // iets met een Scanner
        Scanner input = new Scanner(System.in);
        int antwoord = input.nextInt();

        // bepalen of antwoord goed is
        // zelf antwoord berekenen
        int antwoordGoed = getal1 * getal2;

        // antwoord vergelijken met gebruiker antwoord
        //boolean antwoordGoed = ...;
        //Als het antwoord goed is, krijgt hij/zij de melding “Goed zo!”
        //Als het antwoord niet goed is, krijgt hij/zij het juiste antwoord en de melding “Volgende keer beter”
        if (antwoordGoed == antwoord) {
            System.out.println("Goed bezig!");
        } else {
            System.out.println("Probeer nog een keer");
            System.out.println("Antwoord is : " + antwoordGoed);

        }
    }
}
