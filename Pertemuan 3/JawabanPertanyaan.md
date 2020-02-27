# Jawaban 2.3.3


1. Base lain Algoritma Divide and Conquer adalah pencarian nilai faktorial yang didasarkan pada perhitungan rekursif dan masalah menjadi beberapa bagian yang disebut upa-masalah
2. Devide: if(n==1){
	          	
	          	return 1;
            }else{
                in fakto =n * faktorialDC(n-1);
                return fakto;
        }

   Conquer: int fakto =n * faktorialDC(n-1);

   Combine: return fakto;
3. public int faktorialDC(int n){
	if(n==1){
	    return 1;
    }else{
       int fakto =n* faktorialDC(n-1);
       return fakto;
    }
}  
4. public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = input.nextInt();
        
        Faktorial [] fk = new Faktorial[elemen];
        for(int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+ (i + 1) + " : ");
            fk[i].nilai = input.nextInt();
        }
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai" +fk[i].nilai+ "adalah : "+ fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for(int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai"+ fk[i].nilai+"adalah : "+ fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("=====================================================");
    }
}
5. Ada terjadi perbedaan, apabila menggunakan DC akan lebih lama karena pengulangan akan dilakukan terus menerus sesuai dengan faktorial yang di inputkan. Brutefor lebih cepat daripada DC.


# Jawaban 2.4.3


1. -PangkatBF menggunakan Algoritma Brute Force yaitu dengan  melakukan perulangan secara berurutan.
-PangakatDC menggunakan Algoritma Divide and Conquer yaitu dengan membagi tugasnya sehingga terjadi masalah yang lebih kecil lalu men combinenya kembali, memanggil fungsinya sendiri.
2. Cara mengeksekusinya dengan membagi tugasnya terlebih dahulu menjadi lebih kecil(Algoritma Divide and Conquer).Pada tugasnya program akan membagi elemen menjadi dua bagian, sedangkan pada bilangan ganjil tidak dapat dibagi dua, sehingga dibuat seperti ini :
misalnya 23 = 2x2x2 akan dibagi 2 bagian menjadi : (2x2)(2)
3. if (n==0){
            return 1;
        }
        else{
            if(n%2==1)//bilangan ganjil
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            else//bilangan genap
                return (pangkatDC(a,n/2)*pangkatDC(a, n/2));
        }
    }
4. public class Pangkat {
    public int nilai, pangkat;
    
    public int pangkatBF(int a, int n){
        int hasil = 1;
        for(int i = 0; i < n; i++){
            hasil = hasil * a;
        }
5. public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("=================================================");
            System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
            int elemen = input.nextInt();
            
            Pangkat [] png = new Pangkat[elemen];
            
            for(int i = 0; i < elemen; i++){
                png[i] = new Pangkat();
                System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
                png[i].nilai = input.nextInt();
                System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+ " : ");
                png[i].pangkat = input.nextInt();
            }
            System.out.println("=================================================");
            System.out.print("Hasil Pangkat dengan Brute Force");
            for(int i = 0; i < elemen; i++){
                System.out.println("Nilai"+png[i].nilai+"pangkat"+png[i].pangkat+"adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
            }
            System.out.println("=================================================");
            System.out.print("Hasil Pangkat dengan Divide and Conquer");
            for(int i = 0; i < elemen; i++){
                System.out.println("Nilai"+png[i].nilai+"pangkat"+png[i].pangkat+"adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
            }
            System.out.println("=================================================");
    }  
}


# Jawaban 2.5.3


1. Apabila menggunakan TotalBF perhitungan akan terurut sedangkan menggunakan TotalDC perhitungan akan dibagi menjadi lebih kecil.
2. Menggunakan %.2f untuk nilai koma
3. Proses combine pada method Divide and Conquer
4. Untuk membagi elemen menjadi beberapa bagian
5. public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Program Menghitung Keuntungan Total(Satuan Juta.Misal 5.9)");
        System.out.println("Masukkan banyak perusahaan: : ");
        int perusahaan = input.nextInt();
        
        for(int j = 1; j< perusahaan; j++){
            System.out.println("Perusahaan ke" +j);
            System.out.println("Masukkan jumlah bulan: ");
            int elm = input.nextInt();
        }
        Sum sm = new Sum(elm);
        System.out.println("=====================================================");
        for(int i = 0; i < sm.elemen; i++){
            System.out.println("Masukkan untung bulan ke-"+(i+1)+" = ");
            sm.keuntungan[i] = input.nextDouble();
        }
        System.out.println("=====================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total Keuntungan perusahaan selama"+ sm.elemen+"bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("=====================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen+ "bulan adalah = "+ sm.totalDC(sm.keuntungan,0, sm.elemen-1));
    }
}