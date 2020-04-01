package Tugas2;
/**
 *
 * @author Riza Amalia Hariyanti
 */
import java.util.Scanner;
public class StackMain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        /*
          1. Inputan data
          2. Pengisian data pada stack dengan method push
        */
        
        System.out.println("       == Program Stack ==     ");
        System.out.println("-------------------------------");
        //Instansiasi Objek
        Stack tumpukan = new Stack(2);
        String data[] = new String[2];
        
        System.out.print("Masukkan kalimat : ");
        for (int i = 0; i < 2; i++){
            data[i] = input.nextLine();
            tumpukan.push(data[i]);
        }
        System.out.println("-------------------------------");
        tumpukan.arrange();
        System.out.println("-------------------------------");
    }
}
