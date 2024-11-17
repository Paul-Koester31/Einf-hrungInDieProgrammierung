public class BitQuersumme {
    public static void main(String[] args) {

        int zahl = Integer.parseInt(args[0]);
        int quer = 0;
        for (int i = 0; i < 16; i++) {
            quer += (zahl >> i) & 1;//addieren des gesetzten bits an stelle i
        }
        System.out.println(quer);
    }
}
