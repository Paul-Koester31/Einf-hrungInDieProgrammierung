public class Klausurnoten {
    public static void main(String[] args) {
        int[] punkte = {30, 74, 81, 67, 95, 65};
        int[] grenzen = {59, 69, 79, 89};
        verarbeiteKlausurPunktzahl(punkte, grenzen);
    }

    public static void verarbeiteKlausurPunktzahl(int[] punkte, int[] punktGrenzen) {
        //Anzahl Teilnehmer
        System.out.println(punkte.length);

        //Berechnung der Noten

        int[] noten = new int[punkte.length];

        for (int i = 0; i < punkte.length; i++) {
            if (punkte[i] < punktGrenzen[0]) {
                noten[i] = 5;
            } else if (punkte[i] > punktGrenzen[0] && punkte[i] < punktGrenzen[1]) {
                noten[i] = 4;
            } else if (punkte[i] > punktGrenzen[1] && punkte[i] < punktGrenzen[2]) {
                noten[i] = 3;
            } else if (punkte[i] > punktGrenzen[2] && punkte[i] < punktGrenzen[3]) {
                noten[i] = 2;
            } else noten[i] = 1;
        }

        //beste und schlechteste Note
        int beste = 6;
        int schlechteste = 1;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < beste) beste= noten[i];
            if (noten[i] > schlechteste) schlechteste = noten[i];
        }
        System.out.println(beste + " " + schlechteste);
        //Bestandene Klausuren
        int bestanden = 0;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 5) bestanden++;
        }
        System.out.println(bestanden + " " + (punkte.length - bestanden));
        //Durchschnitt
        double summe = 0;
        for (int i = 0; i < punkte.length; i++) {
            summe += punkte[i];
        }
        System.out.println((summe / punkte.length));

        //Notenspiegel
        int anzahl = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            for (int j = 0; j < noten.length; j++) {
                if (noten[j] == i) anzahl++;
            }
            System.out.println(" " + anzahl);
            anzahl=0;
        }
    }

}