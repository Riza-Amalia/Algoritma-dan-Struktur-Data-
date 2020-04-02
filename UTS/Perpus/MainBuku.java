package Perpus;
/**
 *
 * @author Riza Amalia Hariyanti
 */
import java.util.Scanner;

public class MainBuku {
    static String filter;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListBuku data = new ListBuku();
        Buku[] perpus = new Buku[4];
        double B5 = 29.5, B3 = 19.6, A4 = 29.7;
        
        perpus[0] = new Buku("Introduction To Algorithms", 1292, B5);
        perpus[1] = new Buku("Essentials Of Computer Architecture", 400, A4);
        perpus[2] = new Buku("A Life Out Of Sequence-A Data Driven History Of Bionformatics", 294, B3);
        perpus[3] = new Buku("Engineering a Compiler 2nd Ed", 824, B5);
        data.add(perpus[0]);
        data.add(perpus[1]);
        data.add(perpus[2]);
        data.add(perpus[3]);
        
    
        System.out.println("\n\t\t\t\t\t  *** LIST BUKU ***");
        System.out.println("+-------------------------------------------------------------------+----------------+----------------+");
        System.out.printf("|                            JUDUL BUKU                             | JUMLAH HALAMAN | UKURAN BUKU    |\n");
        System.out.println("+-------------------------------------------------------------------+----------------+----------------+");
        data.show();
        
        boolean loop = true;
        
        while (loop == true) {
                filter = "1";
                if (filter.equalsIgnoreCase("1")) {
                        loop = false;
                } 
        }

        boolean looping = true;
        while (looping == true) {
                String filt = "1";
                if (filt.equalsIgnoreCase("1")) {
                        bubbleSort(data, filter);
                        looping = false;
                } 
        }
        
        System.out.println("      == Daftar Ukuran Kertas ==    ");
        System.out.println("B5 = 29.5");
        System.out.println("A4 = 29.7");
        System.out.println("B3 = 19.6");
        System.out.print("Cari buku berdasarkan ukuran kertas : ");
        String pilih = input.nextLine();
        
        if(pilih.equalsIgnoreCase("B5")){
            System.out.println("Buku yang ditemukan : ");
            System.out.println("1. Introduction To Algorithms");
            System.out.println("2. Engineering a Compiler 2nd Ed");
        } else if (pilih.equalsIgnoreCase("A4")){
            System.out.println("Buku yang ditemukan : ");
            System.out.println("Essentials Of Computer Architecture");
        } else if (pilih.equalsIgnoreCase("B3")){
            System.out.println("Buku yang ditemukan : ");
            System.out.println("A Life Out Of Sequence-A Data Driven History Of Bionformatics");
        } else {
            System.out.println("Input yang anda masukkan salah :");
        }
    }

    static String resultFilter(String filt) {
            String resl;
            if (filt.equalsIgnoreCase("1")) {
                    resl = "Ascending";
            } else {
                    resl = "Descending";
            }
            return resl;
    }

    static void bubbleSort(ListBuku data, String filter) {
            String resultFilt = resultFilter(filter);
            System.out.println();
            System.out.println("\n\t\t\t\t\t  *** LIST BUKU ***");
            System.out.println("\t\t\t\t    ~~ Bubble Sort & " + resultFilt + " ~~\n");
            System.out.println("+-------------------------------------------------------------------+----------------+----------------+");
            System.out.printf("|                            JUDUL BUKU                             | JUMLAH HALAMAN | UKURAN BUKU    |\n");
            System.out.println("+-------------------------------------------------------------------+----------------+----------------+");
            data.bubbleSort(filter);
            data.show();
    }

}