public class Stadion {
    public static void main(String[] args) {
        Person[] zuschauer = new Person[45000];
        for (int i = 0; i < zuschauer.length; i++) {
            zuschauer[i] = new Person("Zuschauer-" + (i + 1));
        }

        Fussballspieler[] rot = new Fussballspieler[5];
        Fussballspieler[] blau = new Fussballspieler[5];

        for (int i = 0; i < rot.length; i++) {
            rot[i] = new Fussballspieler("Spieler-rot-" + (i + 1), 10000 * (i + 1));
        }

        for (int i = 0; i < blau.length; i++) {
            blau[i] = new Fussballspieler("Spieler-blau-" + (i + 1), 20000 * (i + 1));
        }
        Mannschaft man1 = new Mannschaft(rot[0], rot[1], rot[2], rot[3], rot[4]);
        Mannschaft man2 = new Mannschaft(blau[0], blau[1], blau[2], blau[3], blau[4]);

        System.out.println(man1);
        System.out.println(man2);

        // Gesamteinkommen der Mannschaften ausgeben
        System.out.println(man1.einkommen());
        System.out.println(man2.einkommen());

        // Namen des ersten Zuschauers ausgeben
        System.out.println(zuschauer[0].getName());
    }
}
