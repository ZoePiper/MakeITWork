package model;

public class Team {
    private String teamNaam;
    private int totaalWedstrijdPunten;
    private int totaalVoorDoelPunten;
    private int totaalTegenDoelpunten;

    public Team(String teamNaam, int totaalWedstrijdPunten, int totaalVoorDoelPunten, int totaalTegenDoelpunten) {
        this.teamNaam = teamNaam;
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
        this.totaalVoorDoelPunten = totaalVoorDoelPunten;
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }

    public Team(String teamNaam) {
        this(teamNaam,0,0,0);
    }

    public Team() {
        this("");
    }

    public int getDoelSaldo() {
        return  totaalVoorDoelPunten - totaalTegenDoelpunten;
    }

    public void printStatusTeam(){
        System.out.printf("Het team %s heeft %d wedstrijdpunt(en) en een doelsaldo van %d\n",
                this.teamNaam,this.totaalWedstrijdPunten,this.getDoelSaldo());
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }

    public int getTotaalWedstrijdPunten() {
        return totaalWedstrijdPunten;
    }

    public void setTotaalWedstrijdPunten(int totaalWedstrijdPunten) {
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
    }

    public int getTotaalVoorDoelPunten() {
        return totaalVoorDoelPunten;
    }

    public void setTotaalVoorDoelPunten(int totaalVoorDoelPunten) {
        this.totaalVoorDoelPunten = totaalVoorDoelPunten;
    }

    public int getTotaalTegenDoelpunten() {
        return totaalTegenDoelpunten;
    }

    public void setTotaalTegenDoelpunten(int totaalTegenDoelpunten) {
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }
}
