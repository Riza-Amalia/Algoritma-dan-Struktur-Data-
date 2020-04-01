package Tugas1;

/**
 *
 * @author Riza Amalia Hariyanti
 */
import java.util.Scanner;
public class StackMain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        //Instansiasi Objek
        Stack tumpukan = new Stack(4);
        String data[] = new String[4];
        
        /*
          1. Inputan data
          2. Pengisian data pada stack dengan method push
        */
        System.out.println("       == Program Stack ==     ");
        System.out.println("Masukkan kalimat : ");
        for (int i = 0; i < 4; i++){
            System.out.print("Kalimat ke - " + (i + 1) + " : ");
            data[i] = input.next();
            tumpukan.push(data[i]);
        }
        System.out.println("-------------------------------");
        System.out.println("     == Daftar Menu Stack ==   ");
        System.out.println("1. Tampilkan data (print)");
        System.out.println("2. Keluarkan data (pop)");
        System.out.println("3. Cek data teratas (peek)");
        System.out.println("4. Tampilkan ulang data (print)");
        
        String jawab = "y";
        while(jawab.equalsIgnoreCase("y")){
            System.out.print("Pilih Nomor : ");
            int pilih = input.nextInt();
            switch (pilih) {
            case 1:
                //Tampilkan data yang sudah diisi
                tumpukan.print();
                break;
            case 2:
                //Mengeluarkan data
                tumpukan.pop();
                break;
            case 3:
                //Cek data teratas
                tumpukan.peek();
                break;
            case 4:
                //Tampilkan kembali data
                tumpukan.print();
                break;
            default:
                System.out.println("Input salah.");
                break;
            }
            System.out.println("-------------------------------");
            System.out.print("Input ulang menu ? (y/n) : ");
            jawab = sc.next();
        }
    }
}
