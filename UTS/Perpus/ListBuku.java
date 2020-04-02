package Perpus;
/**
 *
 * @author Riza Amalia Hariyanti
*/
public class ListBuku {
    Buku[] perpus = new Buku[4];
    int a;

    void add(Buku tiket) {
        perpus[a] = tiket;
        a++;
    }
    void show() {
        for (Buku daftar : perpus) {
            daftar.show();
            System.out.println("+------------------------------------------------------------------------------------------------------");
        }
    }
    
    void bubbleSort(String filt) {
        if (filt.equalsIgnoreCase("D")) {
            for (int i = 0; i < perpus.length - 1; i++) {
                for (int j = 1; j < perpus.length - i; j++) {
                    if (perpus[j].tinggiBuku > perpus[j - 1].tinggiBuku) {
                        // Swap
                        Buku temp = perpus[j];
                        perpus[j] = perpus[j - 1];
                        perpus[j - 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < perpus.length - 1; i++) {
                for (int j = 1; j < perpus.length - i; j++) {
                    if (perpus[j].tinggiBuku < perpus[j - 1].tinggiBuku) {
                        // Swap
                        Buku temp = perpus[j];
                        perpus[j] = perpus[j - 1];
                        perpus[j - 1] = temp;
                    }
                }
            }
        }
    }
}