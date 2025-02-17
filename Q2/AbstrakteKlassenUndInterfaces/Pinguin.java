package AbstrakteKlassenUndInterfaces;

import java.time.LocalDate;

public class Pinguin extends Tier implements Streichelbar, Tanzbar, ZeigeWerte {
    public Pinguin(String name, int energie, int gesundheit, int zufriedenheit, int intelligenz, LocalDate geburtsdatum) {
        super(name, energie, gesundheit, zufriedenheit, intelligenz, geburtsdatum);
    }

    @Override
    public String macheGeraeusch() {
        return "Bloob-Bloob";
    }

    @Override
    public String getBeschreibung() {
        return "klein und sehr flink";
    }

    @Override
    public void streicheln() {

        this.setZufriedenheit(this.getZufriedenheit() + 5);
        System.out.println("du streichelst den Pinguin. Der Pinguin quitscht vor freude. " + macheGeraeusch());
    }

    @Override
    public void tanzen() {

        this.setEnergie(this.getEnergie() - 5);
        this.setZufriedenheit(this.getZufriedenheit() + 5);
        System.out.println("Der Pinguin tanzt mit dir. Er will dich ablenken. Er sucht in der Zwischenzeit nach einem Fluchtweg.");
    }
}
