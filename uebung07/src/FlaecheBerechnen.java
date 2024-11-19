public class FlaecheBerechnen {
    public static void main(String[] args) {
        float[][] pol = {{0, 0}, {1, 0}, {1, 1},{0, 1}};
        System.out.println(fleacheBerechnen(pol));
    }

    public static float fleacheBerechnen(float[][] coord) {
        float a = 0;
        int n = coord.length;
        for (int i = 0; i <n; i++) {
            int next = (i + 1) % n;
            a += (coord[i][0] + coord[next][0]) * (coord[i][1] - coord[next][1]);
        }
        return Math.abs(a / 2);
    }
}