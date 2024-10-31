public class SummeUngleichNull {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double summe = 0.0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - j != 0) {
                    summe += (double) i / (i - j);
                }

            }
        }
        System.out.println(summe);
    }
}
