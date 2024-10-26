public class ParityBit {
    public static void main(String[] args) {
        int wert = 0x17;

        int nutzbit = (wert >> 1) & 0xF; // 0xF = 1111 als maske über wert >> 1 (rechtsshift)
        int summe = Integer.bitCount(nutzbit); //summe nutzbit
        int parity = wert & 1;// bit an stelle 0

        System.out.println((summe % 2) == parity);
        System.out.println(summe);
        System.out.println(parity);
    }
}
