package AbstrakteKlassenUndInterfaces;

import java.time.LocalDate;

public class Loewe extends Tier implements Fuetterbar, Trainierbar, Gefaehrlich, ZeigeWerte {

    public Loewe(String name, int energie, int gesundheit, int zufriedenheit, int intelligenz, LocalDate geburtsdatum) {
        super(name, energie, gesundheit, zufriedenheit, intelligenz, geburtsdatum);
    }

    @Override
    public String macheGeraeusch() {
        return "Raaahr";
    }

    @Override
    public String getBeschreibung() {
        return "stark und flauschig";
    }

    @Override
    public void fuettern(String futter) {
        Fuetterbar.super.fuettern(futter);

        this.setZufriedenheit(this.getZufriedenheit() + 5);
        this.setEnergie(this.getEnergie() + 5);
        System.out.println("der Löwe frisst ein Steak. " + macheGeraeusch());
    }

    @Override
    public void trainieren() {

        this.setEnergie(this.getEnergie() - 5);
        this.setGesundheit(this.getGesundheit() + 5);
        System.out.println("der Löwe trainiert das Hochspringen.");
    }

    @Override
    public void gefahr() {

        System.out.println("Bitte halten sie abstand vom Käfig");
    }
}