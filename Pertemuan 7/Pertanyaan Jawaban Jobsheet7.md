# Jawaban 1.4.1

1. Kode program di atas untuk memasukkan nilai di variabel main ke dalam variabel yang berada di objek.
2. Pada saat data ke- j sama dengan data yang di cari, maka jawaban sudah di temukan dan tidak perlu mencari lagi sehingga kode program di break.  
3. Masih bisa berjalan dan hasilnya benar angka yang di cari di temukan di indeks ke- 2, karena kita hanya merubah letak angka tersebut bukan mengubah proses pencariannya 


# Jawaban 1.4.2

1.  mid = (left + right) / 2;
            if (cari == data[mid]){
                return(mid);
            }
2. else if (data[mid] > cari){ 
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
3. Data tidak ditemukan, hasilnya tidak sesuai.
4. Program tetap bisa di jalankan. Tetapi hasil dari kode Binary Search tidak sesuai dengan kode program. Alasannya karena data belum diurutkan dengan metode Merge Sort, sehingga pencarian data tidak dapat dilakukan.
5. int data[] = {10, 30, 40, 50, 60, 70, 80, 90};
        Searching pencarian = new Searching(data, 8);
        System.out.println("isi Array : ");
        pencarian.TampilData();