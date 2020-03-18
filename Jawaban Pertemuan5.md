# Jawaban Pertanyaan Pertemuan Lima

1. Terdapat di method void bubblesort()
2. Terdapat di method void selectionSort()
3. Swap adalah proses penukaran data/elemen yang bertipe data sama 
Contoh potongan program untuk melakuakn proses swap :
 for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-1; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
4. Proses tersebut adalah bertujuan untuk melakukan penukaran elemen satu dengan yang lainnya untuk  mendapatkan hasil pengurutan elemen. 
5. a.Pada perulangan i digunakan untuk elemen pertama sebagai awal untuk melakukan perbandingan, sedangkan untuk perulangan j digunakan untuk elemen kedua pada perbandingan yang dilakukan, sehingga elemen pertama dan kedua akan diperbandingkan kemudian akan dilakukan swap sesuai kondisi yang diinginkan.
b.Karena syarat tersebut merupakan value dari semua mahasiswa yang di urutkan melalui ipk nya setelah itu terdapat pada sintaks Mhs.length-1, fungsinya untuk mengurangi satu elemen pada perulangan karena inisialisasi awal i=0.
c.Karena syarata tersebut merupakan value dari banyaknya perulangan dari pernyataan mahasiswa yang berupa nama, tahun masuk, umur dan ipk yang inputannya sesuai dengan banyaknya mahasiswa yang telah di inisialisasikan pada iterasi i.Jadi banyak perulangan adalah iterasi j * 2. 
d.jika banyak data di dalam listMhs = 50, maka banyaknya perulangan i adalah sebanyak O(n)n = 50 dan tahap Bubble Sort yang di tempuh adalah sebanyak O(n*2) = 50*2 = 100 tahapan.
6. Program baris tersebut adalah berfungsi untuk iterasi dari banyaknya indek untuk mencari nilai terkecil ipk sesuai dengan banyaknya elemen sebelum dilakukan penukaraan atau swap pada baris kode berikutnya.
7. void insertionSort(boolean ascending){
        int i,j;
        for(i=1; i<listMhs.length; i++){
            Mahasiswa temp = new Mahasiswa();
            temp = listMhs[i];
            j=i;
            if(ascending){
                while((j>0)&& (listMhs[j-1].ipk > temp.ipk)){
                listMhs[j] = listMhs[j-1];
                j--;
            }
        }else {
                while((j>0)&& (listMhs[j-1].ipk > temp.ipk)){
                listMhs[j] = listMhs[j-1];
                j--;
            }
        }
            listMhs[j] =  temp;
        }
    }    
}    