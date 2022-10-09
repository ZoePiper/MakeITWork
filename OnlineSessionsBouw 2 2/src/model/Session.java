package model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Session implements Comparable<Session> {
    protected Muzikant organisator;
    protected LocalDate datum;
    protected double duur;
    protected boolean opgenomen;

    public Session(Muzikant organisator, LocalDate datum, double duur, boolean opgenomen) {
        this.organisator = organisator;
        this.datum = datum;
        setDuur(duur);
        this.opgenomen = opgenomen;

    }



    public abstract double berekenKosten();

    @Override
    public String toString() {
        return "";
    }

    public Muzikant getOrganisator() {
        return organisator;
    }

    public void setOrganisator(Muzikant organisator) {
        this.organisator = organisator;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public double getDuur() {
        return duur;
    }

    public boolean isOpgenomen() {
        return opgenomen;
    }

    public void setOpgenomen(boolean opgenomen) {
        this.opgenomen = opgenomen;
    }

    public LocalDate getDatum() {
        return datum;
    }
public double setDuur(double duur){
        if(duur>4){
        System.out.println(" Een sessie mag maar 4 uur duren.Dit wordt terug gezet naar standaard 1 uur.");
        }
        return 1.0;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        return Double.compare(session.duur, duur) == 0 && opgenomen == session.opgenomen && Objects.equals(organisator, session.organisator) && Objects.equals(datum, session.datum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organisator, datum, duur, opgenomen);
    }

        }
