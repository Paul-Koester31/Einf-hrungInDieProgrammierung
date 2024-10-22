import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BitExtraktion {
    public static void main(String[] args) throws Exception {
        int x;
        int y;
        int a;


        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            a = Integer.parseInt(args[2]);

            if ((x >= 0 && x <= 31) && (y >= 0 & y <= 31) && (x != y) && (a >= 0 && a <= Math.pow(2, 31))) {
                 String bin = Integer.toBinaryString(a);

                System.out.println(Integer.toBinaryString(a));
            } else throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println("Falsche Eingabe!!");
        }


    }
}