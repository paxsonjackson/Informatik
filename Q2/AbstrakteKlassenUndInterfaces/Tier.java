package AbstrakteKlassenUndInterfaces;

import java.time.LocalDate;
import static java.lang.Math.*;

public abstract class Tier {
    private final String name;
    private int energie;
    private int gesundheit;
    private int zufriedenheit;
    private int intelligenz;
    private final LocalDate geburtsdatum;


    public Tier(String name, int energie, int gesundheit, int zufriedenheit, int intelligenz, LocalDate geburtsdatum) {
        this.name = name;
        this.energie = energie;
        this.gesundheit = gesundheit;
        this.zufriedenheit = zufriedenheit;
        this.intelligenz = intelligenz;
        this.geburtsdatum = geburtsdatum;
    }

    public String getName() {
        return name;
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = max(0, min(100, energie));
    }

    public int getGesundheit() {
        return gesundheit;
    }

    public void setGesundheit(int gesundheit) {
        this.gesundheit = max(0, min(100, gesundheit));
    }

    public int getZufriedenheit() {
        return zufriedenheit;
    }

    public void setZufriedenheit(int zufriedenheit) {
        this.zufriedenheit = max(0, min(100, zufriedenheit));
    }

    public int getIntelligenz() {
        return intelligenz;
    }

    public void setIntelligenz(int intelligenz) {
        this.intelligenz = max(0, min(100, intelligenz));
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public abstract String macheGeraeusch();
    public abstract String getBeschreibung();

}

interface Fuetterbar {
    default void fuettern(String futter) {
        if(futter.isEmpty()) {
            System.out.println("Zum füttern benötigst du Futter.");
        }
    }
}

interface Streichelbar {
    void streicheln();
}

interface Trainierbar {
     void trainieren();
}

interface Tanzbar {
    void tanzen();
}

interface Gefaehrlich {
    void gefahr();
}

interface Auffuehrung {
    void auffuehren();
}

interface ZeigeWerte {
    default void zeigen(Tier tier) {
        System.out.print(tier.getName() + " - " + tier.getBeschreibung() + "\n" + "Energie: " + tier.getEnergie() + "\n" + "Gesundheit: " + tier.getGesundheit() + "\n" + "Zufriedenheit: " + tier.getZufriedenheit() + "\n" + "\n");
    }
}

interface ZeigeStatistik {
    default void durchschnitt(Tier tier) {
        System.out.print(" ");
    }
}