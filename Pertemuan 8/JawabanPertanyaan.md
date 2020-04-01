# Jawaban 8.3.3


1. Fungsi potongan kode diatas adalah untuk melakukan banyaknya data yang diisikan pada stack dengan method push. 
2. <img src="1.png">
3. Ketika dua angka tersebut dimasukkan maka data yang masuk setelah angka 12 keluar adalah angka 17 
sehingga angka 98 tidak dapat masuk stack karena limitasi dari banyaknya elemen stack adalah 4.
4. Source code :
<!-- package Tugas1;
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
 -->
 5. Fungsi inisialisasi angka -1 pada variable top adalah untuk memberikan nilai yang dilakukan sebagai pengecekan apakah data pada stack sudah terisi ataupun masih kosong. 


# Jawaban 8.4.3


1. Fungsi dari method precedence tersebut adalah sebagai evaluasi operator. Operator dengan prioritas lebih tinggi akan dievaluasi terlebih dahulu dibandingkan dengan operator yang mempunyai prioritas lebih rendah. Apabila beberapa operator di dalam ekspresi mempunyai prioritas yang sama, maka operator akan dievaluasi berdasarkan asosiasi dari operator tersebut (operator association). 
2. <img src="2.png">
3. Karena tanda kurung hanya sebagai evaluasi asosiasi operator yang memiliki prioritas yang sama dan memiliki prioritas 0 atau di return ke 0, dan operator tersebut tidak tercantum dalam method precedence, sehingga operatornya tidak ditampilkan. 
4. <img src="3.png">
 Karena operator @ dan # tidak tercantum dalam method precedence sehingga Ketika menggunakan   operator tersebut, maka akan di return ke 0. Sehingga tidak ditampilkan operator tersebut.
   