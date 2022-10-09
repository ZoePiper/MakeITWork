package Controller;

import Model.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class BootverhuurLauncher {
    public static void main(String[] args) {
        // toString print
        Klant jan = new Klant("Jan de boer");
        System.out.println(jan);
        System.out.println();

        //abstract instantiate. Via een subclass
        Motorboot boot1 = new Motorboot("De Engel", 10,180);
        System.out.println("Alle info van de superclass zit ook in de subclass");
        System.out.println(boot1);
        System.out.println();

        //Foutmelding te klein boot
        //WERKT NIET!!!!
        System.out.println("This is an error too short");
        Motorboot boot2 = new Motorboot("Mermaid2", -3,15);//nee,60
        System.out.println(boot2);

        System.out.println();
        // Test berekenHuurprijs() en isVaarbewijsPlichtig()
        System.out.println("test vaarbewijs en huurprijs");
        Motorboot boot4 = new Motorboot("Mermaid", 1,1);//nee,60
        Motorboot boot6 = new Motorboot("Whales", 25,25);//ja,90
        System.out.println(boot4);
        System.out.println(boot6);

//Pakt de eerst statement vaarbewijs en huurprijs voor beide.
        Boot boot7 = new ZeilBoot("Shorty", -108);
        Boot boot3 = new ZeilBoot("De Bengel", 5);
        Boot boot5 = new ZeilBoot("Noah", 18);
        System.out.println(boot3);
        System.out.println(boot5);
//        ArrayList<Boot> boten = new Boot();
//        System.out.println(Array.toString(boten.toArray()));

// Test toevoegen boot aan Verhuur met foutmelding en de toString()
        // jan heeft geen boot
        Verhuur verhuurJan = new Verhuur(jan, LocalDate.parse("2020-12-03"), 5);
        // toString() voor lege verhuur
        System.out.println(verhuurJan);
        System.out.println();

        // Foutmelding Susy mag niet verhuurd worden
        //Jan heeft geen vaarbewijs en moet je wel hebben voor deze boot
        Motorboot susy = new Motorboot("Suzy Q", 11, 21);
        verhuurJan.voegBootToe(susy);

        // Voeg een goede boot toe en test de verhuur
        verhuurJan.voegBootToe(boot2);
        System.out.println(verhuurJan);
        System.out.println();

        // Toevoegen verschillende boten aan klant met vaarbewijs
        Klant vanDerValk = new Klant("van der Valk", "valk@valkmail.com", true);
        Verhuur verhuurValk = new Verhuur(vanDerValk, LocalDate.parse("2020-12-10"), 7);
        verhuurValk.voegBootToe(boot2);
        verhuurValk.voegBootToe(boot7);
        verhuurValk.voegBootToe(susy);
        System.out.println(verhuurValk);
        System.out.println();
    }

}


