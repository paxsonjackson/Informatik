package AbstrakteKlassenUndInterfaces;

import java.time.LocalDate;

public class Elephant extends Tier implements Fuetterbar, Auffuehrung, ZeigeWerte {

    public Elephant(String name, int energie, int gesundheit, int zufriedenheit, int intelligenz, LocalDate geburtsdatum) {
        super(name, energie, gesundheit, zufriedenheit, intelligenz, geburtsdatum);
    }

    @Override
    public String macheGeraeusch() {
        return "tröööt";
    }

    @Override
    public String getBeschreibung() {
        return "groß und grau";
    }

    @Override
    public void fuettern(String futter) {
        Fuetterbar.super.fuettern(futter);

        this.setZufriedenheit(this.getZufriedenheit() + 5);
        this.setEnergie(this.getEnergie() + 5);
        System.out.println("der Elefant frisst einen Busch. " + macheGeraeusch());
    }

    @Override
    public void auffuehren() {

        this.setEnergie(this.getEnergie() - 5);
        this.setIntelligenz(this.getIntelligenz() + 5);
        System.out.println("Der Elephant führt einen Trick auf.");
    }
}

