package AbstrakteKlassenUndInterfaces;

import java.time.LocalDate;

public class Giraffe extends Tier implements Fuetterbar, Trainierbar, ZeigeWerte {

    public Giraffe(String name, int energie, int gesundheit, int zufriedenheit, int intelligenz, LocalDate geburtsdatum) {
        super(name, energie, gesundheit, zufriedenheit, intelligenz, geburtsdatum);
    }

    @Override
    public String macheGeraeusch() {
        return "Brääääh";
    }

    @Override
    public String getBeschreibung() {
        return "groß und Gelb mit schönen Flecken";
    }

    @Override
    public void fuettern(String futter) {
        Fuetterbar.super.fuettern(futter);

        if (!futter.equals("Blätter")) {
            return;
        }
        this.setZufriedenheit(this.getZufriedenheit() + 5);
        this.setEnergie(this.getEnergie() + 5);
        System.out.println("die Giraffe frisst Blätter. " + macheGeraeusch());
    }

    @Override
    public void trainieren() {

        this.setEnergie(this.getEnergie() - 5);
        this.setGesundheit(this.getGesundheit() + 5);
        System.out.println("die Giraffe trainiert das Hals-Wrestling.");
    }
}
