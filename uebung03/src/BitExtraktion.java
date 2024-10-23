public class BitExtraktion {
    public static void main(String[] args) {
        int x;
        int y;
        int a;

        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            a = Integer.parseInt(args[2]);

            if ((x >= 0 && x <= 31) && (y >= 0 & y <= 31) && (x != y) && (a >= 0 && a <= Math.pow(2, 31))) {
                int ergebnis = ((a >> x) & 1) + ((a >> y) & 1);
                System.out.println(ergebnis);

            } else throw new Exception();
        } catch (Exception e) {
            System.out.println("Falsche Eingabe!!");
        }


    }
}