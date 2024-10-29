public class Geradengleichung {
    public static void main(String[] args) {
        try {
            if (args.length < 4) throw new Exception();
            double x1 = Double.parseDouble(args[0]);
            double y1 = Double.parseDouble(args[1]);
            double x2 = Double.parseDouble(args[2]);
            double y2 = Double.parseDouble(args[3]);

            double a = (y2 - y1) / (x2 - x1);

            System.out.println("a=" + a + " b=" + (y1 - (a * x1)));

        } catch (Exception e) {
            System.out.println("Falsche Eingabe!!");
        }
    }
}
