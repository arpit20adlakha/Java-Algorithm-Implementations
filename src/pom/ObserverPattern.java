package pom;

import java.util.ArrayList;

public class ObserverPattern {

    static class SachinCenturyNotifier {
        ArrayList<SachinFan> sachinFans = new ArrayList<>();

        void register(SachinFan sachinFan) {
            sachinFans.add(sachinFan);
        }

        void sachinScoredCentury() {
            for(SachinFan sachinFan : sachinFans) {
                sachinFan.announce();
            }
        }

    }

    static class SachinFan{
        private String name;
        SachinFan(String name) {
            this.name = name;
        }
        void announce() {
            System.out.println(name + " notified");
        }
    }

    public static void main(String[] args) {
        SachinCenturyNotifier notifier = new SachinCenturyNotifier();
        notifier.register(new SachinFan("Ranga"));
        notifier.register(new SachinFan("Ramya"));
        notifier.register(new SachinFan("Veena"));
        notifier.sachinScoredCentury();
    }

}
