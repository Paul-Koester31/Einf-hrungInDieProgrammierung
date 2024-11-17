public class Palindromzahl {


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // 1. Spiegelwert ausgeben
        int spiegelwert = spiegeln(n);
        System.out.println(spiegelwert);

        // 2. Summe aus Ursprungswert und Spiegelwert ausgeben
        int summe = spiegelAddieren(n);
        System.out.println(summe);

        // 3. Algorithmus für das Erreichen einer Palindromzahl
        while (!palindromTest(n)) {
            n = spiegelAddieren(n);
        }

        // Letzte Ausgabe: Die Palindromzahl
        System.out.println(n);
    }
      public static int spiegeln(int zahl) {
        int spiegel = 0;
        while (zahl > 0) {
            int letzteZiffer = zahl % 10;
            spiegel = spiegel * 10 + letzteZiffer;
            zahl = zahl / 10;
        }
        return spiegel;
    }

    // Methode zur Spiegelzahl-Addition
    public static int spiegelAddieren(int zahl) {
        int spiegel = spiegeln(zahl);
        return zahl + spiegel;
    }

    // Methode zum Testen, ob eine Zahl ein Palindrom ist
    public static boolean palindromTest(int zahl) {
        return zahl == spiegeln(zahl);
    }
}
