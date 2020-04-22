package Tugas1;
/**
 *
 * @author Riza Amalia H 
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mainMahasiswa {
   String nim,nama,alamat;
   mahasiswaLinkedList data = new mahasiswaLinkedList();
   Scanner input = new Scanner(System.in);
   int pilih;
   
    public static void main (String[] args) throws Exception {
        System.out.println("       == Program Linked List Mahasiswa ==      ");
        System.out.println("------------------------------------------------");
        Scanner input = new Scanner(System.in);
        
        int pilih;
        mainMahasiswa list  = new mainMahasiswa(); 
        mainMahasiswa.menu ();
        pilih = input.nextInt();
        list.pilihmenu(pilih);  
        
    }

    public static void menu() {
        System.out.println();
        System.out.println("================================================");
        System.out.println("                    MAIN MENU                   ");
        System.out.println("================================================");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari ");
        System.out.println("4. Print");
        System.out.println("5. Keluar");
        System.out.println("================================================");
        System.out.print("Pilih menu : ");
    }

    void pilihmenu(int menu) throws Exception {
        switch (menu) {
        case 1:
            submenu1();
             break;
        case 2:
            submenu2();
            break;
        case 3:
             submenu3();          
             break;
        case 4: 
            System.out.println();
             data.print();
             break;
        default:
             System.out.println("Anda keluar dari program !");       
              
        }
    }
   
   void submenu1() throws Exception {
            System.out.println("=========================================="); 
            System.out.println("                 Menu Tambah              ");
            System.out.println("==========================================");
            System.out.println("1. Tambah (First)");
            System.out.println("2. Tambah (Index)");
            System.out.println("3. Tambah (Last)");
            System.out.println("4. Keluar");
            System.out.println("=========================================");
            System.out.print("Pilih submenu :  ");
            int submenu1 = input.nextInt();
            
                switch(submenu1)   {
                case 1 : 
                    System.out.print("Masukkan NIM\t: ");
                    nim = input.next();
                    System.out.print("Masukkan Nama\t: ");
                    nama = input.next();
                    System.out.print("Masukkan Alamat\t: ");
                    alamat = input.next();
                    data.addFirst(nim,nama,alamat);
                    System.out.println();
                    data.print();
                    break;
                    
                case 2 :  
                    System.out.print("Masukkan Index  : ");
                    int index = input.nextInt();
                    System.out.print("Masukkan NIM\t: ");
                    nim = input.next();
                    System.out.print("Masukkan Nama\t: ");
                    nama = input.next();
                    System.out.print("Masukkan Alamat\t: ");
                    alamat = input.next();
                
         {
             try {
                 data.add(nim,nama,alamat,index);
             } catch (Exception ex) {
                 Logger.getLogger(mainMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
                       System.out.println("");
                       data.print();
                       break;
                       
                   case 3 :
                       System.out.print("Masukkan NIM\t: ");
                       nim = input.next();
                       System.out.print("Masukkan Nama\t: ");
                       nama = input.next();
                       System.out.print("Masukkan Alamat\t: ");
                       alamat = input.next();                   
                       data.addLast(nim,nama,alamat);
                       System.out.println();
                       data.print();
                       break;

                   default :
                       System.out.println("Terimakasih !");
               }
       menu();
       pilih = input.nextInt();
       pilihmenu(pilih);
    }
   
    void submenu2() throws Exception {
               System.out.println("=========================================="); 
               System.out.println("                Menu Hapus                ");
               System.out.println("==========================================");
               System.out.println("1. Hapus (Index)");
               System.out.println("2. Hapus (Key)");
               System.out.println("3. Clear");
               System.out.println("4. Print");
               System.out.println("5. Keluar");
               System.out.println("==========================================");

               System.out.print("Pilih submenu yang diinginkan : ");
               int submenu2 = input.nextInt();
               System.out.println();
                 
                switch(submenu2){
                    case 1 : 
                       System.out.print("Masukkan index : ");
                       int index = input.nextInt();
                {
                    try {
                        data.remove(index);
                    } catch (Exception ex) {
                        Logger.getLogger(mainMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                       break;                     
                    case 2 :
                       System.out.print("Masukkan nim yang dihapus : ");
                       nim = input.next();
                {
                    try {
                        data.RemoveByValue(nim);
                    } catch (Exception ex) {
                        Logger.getLogger(mainMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                       break;                   
                   case 3 :
                       data.clear();
                       break;  
                   
                   case 4 :
                       System.out.println("");
                       data.print();
                       break;
                        
                   default :
                       System.out.println("Terimakasih !");
               }
       menu();
       pilih = input.nextInt();
       pilihmenu(pilih);
    }
    
    void submenu3() throws Exception {
               System.out.println("=========================================="); 
               System.out.println("                 Menu Cari                ");
               System.out.println("==========================================");
               System.out.println("1. Cari (Index)");
               System.out.println("2. Cari (Key)");
               System.out.println("3. Print");
               System.out.println("4. Keluar");   
               System.out.println("==========================================");
               System.out.print("Pilih menu : ");
               int submenu3 = input.nextInt();
               
               switch(submenu3)   {
                    case 1 : 
                    System.out.println("Cari (Index)");
                    System.out.print("Masukkan Index : ");
                    int index = input.nextInt();
                    data.cariIndex(index);
                    break;    
                    case 2 :
                       System.out.print("Masukkan nim yang dicari: ");
                       nim = input.next();
                       data.cariKey(nim);
                    break; 
                    case 3 :
                       data.print();
                    break;    
                       
                    default :
                       System.out.println("Terimakasih !");
               }
               
       menu();
       pilih = input.nextInt();
       pilihmenu(pilih);
    }
}