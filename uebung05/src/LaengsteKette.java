import java.util.Scanner;

public class LaengsteKette {
    public static void main(String[] args) {
        int lz = -11;
        int k = 1;
        int lk = 0;
        int anzahl = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i == lz) k++;
            else k = 1;

            lz = i;
            if (k > lk) lk = k;
            anzahl++;
        }
        if (anzahl < 1) {
            System.out.println("Falsche Eingabe!");
            return;
        }
        System.out.println(lk);
    }
}