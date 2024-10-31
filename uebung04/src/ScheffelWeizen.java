public class ScheffelWeizen {
    public static void main(String[] args) {
        int s = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        for (int m = 0; m <= n; m++) {
            for (int w = 0; w <= n - m; w++) {
                int k = n - m - w;
                if (6 * m + 4 * w + k == 2 * s) {
                    System.out.println(m + " " + w + " " + k);
                }
            }
        }
    }
}