public class Parasitenzahl {

    // Hauptprogramm
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Bitte geben Sie einen Wert m als Parameter an.");
            return;
        }

        long m;
        try {
            m = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Ungültiger Eingabewert. Bitte geben Sie eine natürliche Zahl an.");
            return;
        }

        if (m <= 0) {
            System.out.println("Bitte geben Sie eine natürliche Zahl größer als 0 an.");
            return;
        }

        // Suche nach Parasitenzahlen zwischen 1 und m
        for (long i = 1; i <= m; i++) {
            if (istParasitenzahl(i)) {
                System.out.println(i);
            }
        }
    }

    // Methode zur Berechnung einer Potenz: base^exponent


    // Methode zur Überprüfung, ob eine Zahl eine Parasitenzahl ist
    public static boolean istParasitenzahl(long zahl) {
        long letzteZiffer = zahl % 10; // x1
        if (letzteZiffer == 0) return false; // Zahlen mit 0 am Ende sind keine Parasitenzahlen

        long restZahl = zahl / 10; // xnxn-1...x2
        int ziffernAnzahl = (int) Math.log10(zahl) + 1; // Anzahl der Dezimalstellen von zahl
        long neueZahl = (long) (letzteZiffer * Math.pow(10, ziffernAnzahl - 1) + restZahl); // x1xnxn-1...x2

        return letzteZiffer * zahl == neueZahl; // x1 * (xnxn-1...x2x1) == x1xnxn-1...x2
    }

}
