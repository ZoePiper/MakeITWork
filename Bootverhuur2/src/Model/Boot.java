package Model;

public abstract class Boot implements VrijVerhuurbaar, Comparable<Boot> {
    private static final int DEFAULT_LENGTE = 5;
    private static int lastId = 0;
    private final int id; // mag niet veranderen
    private String naam;
    private int lengte;

    public Boot(String naam, int lengte) {
        this.naam = naam;
        this.lengte = lengte;
        this.id = ++lastId;
    }

    //lege methode, in subclasse invullen
    public abstract double berekenHuurprijs();

    @Override
    public int compareTo(Boot anderBoot) {
// sorteer op naam
        return this.naam.compareTo(anderBoot.getNaam());
    }

    public String toString() {
        return String.format("Boot %d met naam %s.\n",
                id, naam);
    }

    public String getNaam() {
        return naam;
    }



    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        if (lengte <= 0) {
            System.out.printf("De lengte moet positief zijn. " +
                            "De lengte wordt op %d meter gezet.\n",
                    DEFAULT_LENGTE);
        } else {
            this.lengte = lengte;
        }
    }

}
