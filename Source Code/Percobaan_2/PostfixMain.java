package Percobaan_2;
import java.util.Scanner;

/**
 *
 * @author Amelia
 */
public class PostfixMain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika : ");
        Q = input.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    }
}
