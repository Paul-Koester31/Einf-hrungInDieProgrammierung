import java.util.Scanner;

public class DatumErweiterung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxTage;

        try {
            int j = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int s = Integer.parseInt(sc.next());
            int m1 = Integer.parseInt(sc.next());
            int m2 = Integer.parseInt(sc.next());

            if (j < 1600 || j > 3000) throw new Exception("Jahr");
            if (m < 1 || m > 12) throw new Exception("Monat");


            if (m == 4 || m == 6 || m == 9 || m == 11) {
                maxTage = 30;
            } else if (m == 2) {
                maxTage = 28;
            } else maxTage = 31;

            if (t < 1 || t > maxTage) throw new Exception("Tag");
            if (s < 0 || s > 23) throw new Exception("Stunde");
            if (m1 < 0 || m1 > 59) throw new Exception("Minute");
            if (m2 < 0 || m2 > 40000) throw new Exception("addierte Minute");

            m1 = m1 + m2;

            while (m1 > 59) {
                m1 = m1 - 60;
                s++;
                if (s > 23) {
                    s = 0;
                    t++;
                    if (t > maxTage) {
                        t = 1;
                        m++;
                        if (m > 12) {
                            m = 1;
                            j++;
                        }
                    }
                }
            }
            System.out.println("" + j + " " + m + " " + t + " " + s + " " + m1);

        } catch (Exception e) {
            System.out.println("Falsche Eingabe: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}