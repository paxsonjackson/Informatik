package AbstrakteKlassenUndInterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.time.LocalDate.now;

public class Zoo {
    public static ArrayList<Tier> tiere = new ArrayList<Tier>();

    public static void main(String[] args) {
        add(new Elephant("Dumbo", 80, 80, 80, 80, LocalDate.of(2017, 7, 5)));
        add(new Giraffe("Butterfly", 80, 80, 80, 80, LocalDate.of(2000, 10, 27)));
        add(new Loewe("Sambano", 80, 80, 80, 80, LocalDate.of(2022, 5, 20)));
        add(new Schwein("Lisa", 80, 80, 80, 80, LocalDate.of(2009, 3, 11)));
        add(new Pinguin("Skipper", 80, 80, 80, 80, LocalDate.of(2015, 9, 23)));
        add(new Pinguin("Kowalski", 80, 80, 80, 80, LocalDate.of(20018, 10, 1)));
        add(new Pinguin("Private", 80, 80, 80, 80, LocalDate.of(2020, 3, 17)));
        add(new Pinguin("Rico", 80, 80, 80, 80, LocalDate.of(2021, 2, 15)));
        add(new Loewe("LeGoat", 80, 80, 80, 80, LocalDate.of(1984, 12, 30)));
        add(new Elephant("Peanutbutter", 80, 80, 80, 80, LocalDate.of(2011, 5, 25)));
        add(new Giraffe("Annabel", 80, 80, 80, 80, LocalDate.of(2013, 3, 22)));

        System.out.println();
        fuettereAlle("futter");
        System.out.println();
        streicheAlle();
        System.out.println();
        trainiereAlle();
        System.out.println();
        tanzenAlle();
        System.out.println();
        zeigeStatistik();
        zeigeWerte();
        entferneTier("Lisa");
    }

    public static void add(Tier tier) {
        if (tiere.size() >= 10) {
            tiere.remove(0);
            System.out.println("Der Zoo ist voll. Das älteste Tier " + /*+ tier.getName() +*/ "wurde entfernt.");
        }
        tiere.add(tier);
    }

    private static void tanzenAlle() {
        for (Tier tier : tiere) {
            if (tier instanceof Tanzbar) {
                ((Tanzbar) tier).tanzen();
            }
        }
    }
    private static void fuettereAlle(String futter) {
        for (Tier tier : tiere) {
            if (tier instanceof Fuetterbar) {
                ((Fuetterbar) tier).fuettern(futter);
            }
            if (tier instanceof Giraffe) {
                ((Giraffe) tier).fuettern("Blätter");
            }
        }
    }

    private static void streicheAlle() {
        for (Tier tier : tiere) {
            if (tier instanceof Streichelbar) {
                ((Streichelbar) tier).streicheln();
            }
        }
    }

    private static void trainiereAlle() {
        for (Tier tier : tiere) {
            if (tier instanceof Trainierbar) {
                ((Trainierbar) tier).trainieren();
            }
        }
    }

    private static void zeigeWerte() {
        for (Tier tier : tiere) {
            if (tier instanceof ZeigeWerte) {
                ((ZeigeWerte) tier).zeigen(tier);
            }
        }
    }

    public static double durchschnitt(double[] data) {
        return Arrays.stream(data).sum()/data.length;
    }
    private static void zeigeStatistik() {
        for (Tier tier : tiere) {
            if (tier instanceof ZeigeStatistik) {
                int n = tier.getEnergie();
                int d = n / tiere.size();
                System.out.print(d);
                ((ZeigeStatistik) tier).durchschnitt(tier);
            }
        }
    }

    private static void entferneTier(String name) {
        for (Iterator<Tier> toeten = tiere.iterator(); toeten.hasNext();) {
            Tier tier = toeten.next();
            if (tier.getName().equals(name)) {
                toeten.remove();
                System.out.println(tier.getName() + " wurde getötet.");
            }
        }
    }
}

//4 c)
//Durschnittswert aller Tiere bei Energie, Zufriedenheit, Gesundheit