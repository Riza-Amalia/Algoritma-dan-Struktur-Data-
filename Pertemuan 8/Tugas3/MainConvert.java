package Tugas3;
/**
 *
 * @author Riza Amalia Hariyanti
 */
import java.util.Scanner;
public class MainConvert {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convert s = new Convert();
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.print("Inputkan Notasi Infix\t: "); 
        String input = sc.next();
        System.out.println("------------------------------------------");
        s.postfix(input);
        s.prefix(input);
        System.out.println("------------------------------------------");
    }
}
