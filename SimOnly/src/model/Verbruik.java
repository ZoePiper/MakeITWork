package model;

public class Verbruik {
    private  final static double BASIS_KOSTEN = 9.95;
    private static final int VERBRUIK_ABONOMENT = 3000;
    private static final double MEERPRIJS_MB = 0.025;


    private String maand;
    private int hoeveelheidMb;
    private double kosten;


    public Verbruik(String maand, int hoeveelheidMb) {
        this.maand = maand;
        this.hoeveelheidMb = hoeveelheidMb;
    }

    public Verbruik(String maand) {
        this(maand, 0);
    }

    public Verbruik() {
        this("onbekend", 0);
    }

    public double berekenKosten() {
        if(hoeveelheidMb > VERBRUIK_ABONOMENT){
            int overVerbruik = hoeveelheidMb-VERBRUIK_ABONOMENT ;
            kosten = overVerbruik * MEERPRIJS_MB + BASIS_KOSTEN;
            System.out.println(kosten + " buiten je bundel");
        }else{
            kosten = BASIS_KOSTEN;
        }
        return kosten;
    }

  public  double toonVerbruik(){
     return hoeveelheidMb;
  }

    public String getMaand() {
        return maand;
    }

    public void setMaand(String maand) {
        this.maand = maand;
    }

    public int getHoeveelheidMb() {
        return hoeveelheidMb;
    }

    public void setHoeveelheidMb(int hoeveelheidMb) {
        this.hoeveelheidMb = hoeveelheidMb;
    }
}
