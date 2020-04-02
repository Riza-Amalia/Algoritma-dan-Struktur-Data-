package Perpus;
/**
 *
 * @author Riza Amalia Hariyanti
 */
public class Buku {
    String judul;
    int jumlahHalaman;
    double tinggiBuku;
    
    Buku() {
    }
    
    Buku(String judul, int jumlahHalaman, double tinggiBuku){
        this.judul = judul;
        this.jumlahHalaman = jumlahHalaman;
        this.tinggiBuku = tinggiBuku;
    }

    void show() {
        System.out.printf("%s %-65s %s %-14d %s %-14.1f %s \n","|", judul,
                "|", jumlahHalaman, "|", tinggiBuku, "|");
    }
    
}

