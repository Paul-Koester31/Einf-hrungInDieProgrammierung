import java.util.Scanner;

public class IbanBerechnen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String laenderkennung = sc.next();


        String blz = sc.next();


        String kontonummer = sc.next();

        // IBAN berechnen und ausgeben
        String iban = erzeugeIban(laenderkennung, blz, kontonummer);
        System.out.println(iban);
    }

    //Länderkennung normalisieren
    public static String normalisiereLaenderkennung(String laenderkennung) {
        return laenderkennung.toUpperCase();
    }

    //Kontonummer auf 10 Stellen normalisieren
    public static String normalisiereKontonummer(String kontonummer) {
        while (kontonummer.length() < 10) {
            kontonummer = "0" + kontonummer;
        }
        return kontonummer;
    }

    //BBAN erstellen
    public static String erzeugeBBAN(String blz, String kontonummer) {
        String normKontonummer = normalisiereKontonummer(kontonummer);
        return blz + normKontonummer; // Bankleitzahl + Kontonummer
    }

    //Länderkennung in Zahlen umwandeln und anhängen
    public static String erweitereBBAN(String laenderkennung, String bban) {
        laenderkennung = normalisiereLaenderkennung(laenderkennung);
        int ersterBuchstabe = laenderkennung.charAt(0) - 'A' + 10; // z. B. 'D' → 13
        int zweiterBuchstabe = laenderkennung.charAt(1) - 'A' + 10; // z. B. 'E' → 14
        return bban + ersterBuchstabe + zweiterBuchstabe + "00";
    }

    //Modulo-97 für eine lange Ziffernfolge berechnen
    public static int berechneModulo97(String zahl) {
        while (zahl.length() > 9) {
            long teil = Long.parseLong(zahl.substring(0, 9));
            int rest = (int) (teil % 97);
            zahl = rest + zahl.substring(9); // Reste vorne anhängen
        }
        return (int) (Long.parseLong(zahl) % 97);
    }

    // Schritt 6: Prüfzahl berechnen
    public static String berechnePruefziffer(String laenderkennung, String bban) {
        String erweiterteBBAN = erweitereBBAN(laenderkennung, bban);
        int mod97 = berechneModulo97(erweiterteBBAN);
        int pruefziffer = 98 - mod97;
        return (pruefziffer < 10 ? "0" : "") + pruefziffer; // Immer zweistellig
    }

    //IBAN erzeugen
    public static String erzeugeIban(String laenderkennung, String blz, String kontonummer) {
        String bban = erzeugeBBAN(blz, kontonummer);
        String pruefziffer = berechnePruefziffer(laenderkennung, bban);
        return normalisiereLaenderkennung(laenderkennung) + pruefziffer + bban;
    }


}
