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

    public String getNaamMuzikant() {
        return naamMuzikant;
    }

    public void setNaamMuzikant(String naamMuzikant) {
        this.naamMuzikant = naamMuzikant;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getJaarErvaring() {
        return jaarErvaring;
    }

    public void setJaarErvaring(int jaarErvaring) {
        this.jaarErvaring = jaarErvaring;
    }
}
