import java.util.Scanner;

public class Lauflaengenkodierung {
    public static void main(String[] args) {
        int lz = -1;
        int k = 0;
        String ergebnis = "";

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equals(".")) {
                if (k > 0) ergebnis += k + "x" + lz + ".";

                break;
            }
            int w = Integer.parseInt(input);
            if (lz == w || k ==0) {
                k++;
            } else {
                ergebnis +=k + "x" + lz + ".";
                k = 1;
            }
            lz = w;

        }
        System.out.println(ergebnis);


    }
}

