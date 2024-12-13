public class Spiegeln {
    public static void main(String[] args) {
        String s = "Hallo";
        System.out.println(s +" gespiegelt ist "+ spiegeln(s));
    }

    public static String spiegeln(String s) {
        String spiegel = "";
        Stack st = new Stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            spiegel += st.pop();
        }
        return spiegel;
    }
}
