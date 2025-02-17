package AbstrakteKlassenUndInterfaces;

import java.time.LocalDate;

public class Schwein extends Tier implements Streichelbar, Tanzbar, ZeigeWerte {
    public Schwein(String name, int energie, int gesundheit, int zufriedenheit, int intelligenz, LocalDate geburtsdatum) {
        super(name, energie, gesundheit, zufriedenheit, intelligenz, geburtsdatum);
    }

    @Override
    public String macheGeraeusch() {
        return "Oink-Oink";
    }

    @Override
    public String getBeschreibung() {
        return "klein und hat ein ringel Schwanz";
    }

    @Override
    public void streicheln() {

        this.setZufriedenheit(this.getZufriedenheit() + 5);
        System.out.println("du streichelst das Schwein. Das Schwein quitscht vor freude. " + macheGeraeusch());
    }

    @Override
    public void tanzen() {

        this.setEnergie(this.getEnergie() - 5);
        this.setZufriedenheit(this.getZufriedenheit() + 5);
        System.out.println("Das Schwein tanzt mit dir.");
    }
}
