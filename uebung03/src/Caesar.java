import java.util.Scanner;

public class Caesar {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        char b;

        try {

            k = Integer.parseInt(sc.nextLine());

            String eingabe = sc.nextLine();

            if (eingabe.length() != 1||!Character.isAlphabetic(eingabe.charAt(0))) throw new Exception();
            b = eingabe.charAt(0);
            if (Character.isLowerCase(b)){
                System.out.println((char) ((b - 'a'+k)%26 +'a'));
            }else System.out.println((char) ((b - 'A'+k)%26 +'A'));


        } catch (Exception e) {
            System.out.println("Falsche Eingabe!!!");
        }
    }
}
