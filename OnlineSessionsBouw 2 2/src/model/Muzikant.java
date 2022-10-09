package model;

public class Muzikant {
    private String naamMuzikant;
    private String instrument;
    private int jaarErvaring;

    public Muzikant(String naamMuzikant, String instrument, int jaarErvaring) {
        this.naamMuzikant = naamMuzikant;
        this.instrument = instrument;
        this.jaarErvaring = jaarErvaring;
    }


    public String toString() {
        return String.format("%s op %s met %d jaar ervaring.\n", naamMuzikant, instrument, jaarErvaring);
    }

}
