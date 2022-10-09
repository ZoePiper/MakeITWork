package model;

public class Wedstrijd {
    private Team thuisTeam;
    private Team uitTeam;
    private int thuisDoelPunten;
    private int uitDoelpunten;



    public Wedstrijd(Team thuisTeam, Team uitTeam, int thuisDoelPunten, int uitDoelpunten) {
        this.thuisTeam = thuisTeam;
        this.uitTeam = uitTeam;
        this.thuisDoelPunten = thuisDoelPunten;
        this.uitDoelpunten = uitDoelpunten;
    }

    public Wedstrijd(Team thuisTeam, Team uitTeam) {
        this (thuisTeam,uitTeam,0,0);
    }
// default is: maak een nieuw team aan.
    public Wedstrijd() {
        this(new Team(),new Team());
    }

    public int getWedstrijdPuntenThuisTeam(){
 if (thuisDoelPunten >uitDoelpunten){
     return 3;
 } else if (thuisDoelPunten == uitDoelpunten) {
     return 1;
 }else {
     return 0;
 }
    }
    public int getWedstrijdPuntenUitTeam() {
        if (thuisDoelPunten < uitDoelpunten) {
            return 3;
        } else if (thuisDoelPunten == uitDoelpunten) {
            return 1;
        } else {
            return 0;
        }
    }
    // Na scrhrijven
    public void setWedstrijdPuntenThuisTeam() {
        int wedstrijdpuntenThuisTeam = thuisTeam.getTotaalWedstrijdPunten();
        thuisTeam.setTotaalWedstrijdPunten(wedstrijdpuntenThuisTeam + this.getWedstrijdPuntenThuisTeam());
    }

    public void setWedstrijdPuntenUitTeam() {
        int wedstrijdpuntenUitTeam = uitTeam.getTotaalWedstrijdPunten();
        uitTeam.setTotaalWedstrijdPunten(wedstrijdpuntenUitTeam + this.getWedstrijdPuntenUitTeam());
    }
    public void setTotaalDoelpuntenTeams(){
        // 1. Werk het totaalVoorDoelpunten voor het thuisTeam bij.
        // Haal eerst het huidige totaalVoorDoelpunten van het thuisTeam op
        int totaalVoorDoelpuntenThuisTeam = thuisTeam.getTotaalVoorDoelPunten();
        // Verhoog dit met de voorDoelpunten in deze wedstrijd (= thuisDoelpunten)
        totaalVoorDoelpuntenThuisTeam += thuisDoelPunten;
        // Sla de nieuwe waarde op voor het thuisTeam
        thuisTeam.setTotaalVoorDoelPunten(totaalVoorDoelpuntenThuisTeam);

        // 2. Werk het totaalTegenDoelpunten voor het thuisTeam bij.
        // Haal eerst het huidige totaalTegenDoelpunten van het thuisTeam op
        int totaalTegenDoelpuntenThuisTeam = thuisTeam.getTotaalTegenDoelpunten();
        // Verhoog dit met de tegenDoelpunten in deze wedstrijd (= uitDoelpunten)
        totaalTegenDoelpuntenThuisTeam += uitDoelpunten;
        // Sla de nieuwe waarde op voor het thuisTeam
        thuisTeam.setTotaalTegenDoelpunten(totaalTegenDoelpuntenThuisTeam);

        // 3. Werk het totaalVoorDoelpunten voor het uitTeam bij.
        // Haal eerst het huidige totaalVoorDoelpunten van het uitTeam op
        int totaalVoorDoelpuntenUitTeam = uitTeam.getTotaalVoorDoelPunten();
        // Verhoog dit met de voorDoelpunten in deze wedstrijd (= uitDoelpunten!!!)
        totaalVoorDoelpuntenUitTeam += uitDoelpunten;
        // Sla de nieuwe waarde op voor het uitTeam
        uitTeam.setTotaalVoorDoelPunten(totaalVoorDoelpuntenUitTeam);

        // 4. Werk het totaalTegenDoelpunten voor het uitTeam bij.
        // Haal eerst het huidige totaalTegenDoelpunten van het uitTeam op
        int totaalTegenDoelpuntenUitTeam = uitTeam.getTotaalTegenDoelpunten();
        // Verhoog dit met de tegenDoelpunten in deze wedstrijd (= thuisDoelpunten!!!)
        totaalTegenDoelpuntenUitTeam += thuisDoelPunten;
        // Sla de nieuwe waarde op voor het uitTeam
        uitTeam.setTotaalTegenDoelpunten(totaalTegenDoelpuntenUitTeam);
        int totaaltegenUit = uitTeam.getTotaalTegenDoelpunten();

        // TO DO: Test dit:
        // uitTeam.setTotaalTegenDoelpunten(uitTeam.getTotaalTegenDoelpunten() + thuisDoelpunten);

    }
    public void printUitslag(){
        System.out.printf("Uitslag van de wedstrijd %s %s : %d - %d\n",
                this.thuisTeam.getTeamNaam(),this.uitTeam.getTeamNaam(),
                this.thuisDoelPunten,this.uitDoelpunten);
    }
    public void printWedstrijdPunten(){
        System.out.printf("Dit levert %d wedstrijdpunt(en) voor %s en %d wedstrijdpunten voor %s.\n",
                getWedstrijdPuntenThuisTeam(),this.thuisTeam.getTeamNaam(),
                getWedstrijdPuntenUitTeam(),this.uitTeam.getTeamNaam());
    }

//Getters & Setters
    public Team getThuisTeam() {
        return thuisTeam;
    }

    public void setThuisTeam(Team thuisTeam) {
        this.thuisTeam = thuisTeam;
    }

    public Team getUitTeam() {
        return uitTeam;
    }

    public void setUitTeam(Team uitTeam) {
        this.uitTeam = uitTeam;
    }

    public int getThuisDoelPunten() {
        return thuisDoelPunten;
    }

    public void setThuisDoelPunten(int thuisDoelPunten) {
        this.thuisDoelPunten = thuisDoelPunten;
    }

    public int getUitDoelpunten() {
        return uitDoelpunten;
    }

    public void setUitDoelpunten(int uitDoelpunten) {
        this.uitDoelpunten = uitDoelpunten;
    }

    @Override
    public String toString() {
        return "Wedstrijd{" +
                "thuisTeam=" + thuisTeam +
                ", uitTeam=" + uitTeam +
                ", thuisDoelPunten=" + thuisDoelPunten +
                ", uitDoelpunten=" + uitDoelpunten +
                '}';
    }
}
