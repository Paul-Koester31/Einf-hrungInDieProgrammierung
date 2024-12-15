public class Mannschaft {
    private Fussballspieler[] team = new Fussballspieler[5];

    public Mannschaft(Fussballspieler s1, Fussballspieler s2, Fussballspieler s3, Fussballspieler s4, Fussballspieler s5) {
        this.team[0] = s1;
        this.team[1] = s2;
        this.team[2] = s3;
        this.team[3] = s4;
        this.team[4] = s5;
    }

    public int einkommen() {
        int gesamteinkommen = 0;
        for (int i = 0; i < team.length; i++) {
            gesamteinkommen += team[i].getEinkommen();
        }
        return gesamteinkommen;
    }

    @Override
    public String toString() {
        StringBuilder aufstellung = new StringBuilder();
        for (int i = 0; i < team.length; i++) {
            aufstellung.append(i + 1).append(". ").append(team[i].getName()).append("\n");
        }
        return aufstellung.toString();
    }

}

