public class Vertauschen {
    public static void main(String[] args) {
        String[] inhalt = vertauscheInhalt(args);
        String[] referenz = vertauscheReferenz(args);


        // Tests
        if (!testInhaltGleich(inhalt, referenz)) {
            System.out.println("Fehler: Inhalte stimmen nicht überein!");
        }
        if (testReferenzGleich(inhalt, referenz)) {
            System.out.println("Fehler: Referenzen müssen unterschiedlich sein!");
        }
    }

    public static String[] vertauscheInhalt(String[] input) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = new String(input[input.length - 1 - i]);
        }
        return result;
    }

    public static String[] vertauscheReferenz(String[] input) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[input.length - 1 - i]; // Copy reference directly
        }
        return result;
    }

    public static boolean testInhaltGleich(String[] arg1, String[] arg2) {
        if (arg1.length != arg2.length) {
            return false;
        }
        for (int i = 0; i < arg1.length; i++) {
            if (!arg1[i].equals(arg2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean testReferenzGleich(String[] arg1, String[] arg2) {
        if (arg1.length != arg2.length) {
            return false;
        }
        for (int i = 0; i < arg1.length; i++) {
            if (arg1[i] != arg2[i]) {
                return false;
            }
        }
        return true;
    }
}
