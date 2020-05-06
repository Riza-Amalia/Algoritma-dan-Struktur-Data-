package Tugas3;
/*
Nama : Riza Amalia Hariyanti
Kelas : TI 1F
Absen : 26
*/
import java.util.Scanner;
public class DoubleLinkedListsMain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        System.out.println(" DOUBLE LINKED LIST DENGAN MENU ");
        
        do {
            try {
                menu();
                int menu = input.nextInt();
                int subMenu;
                switch(menu) {
                    case 1:
                        tambahSubMenu();
                        subMenu = input.nextInt();
                        switch(subMenu) {
                            case 1:
                                System.out.print("Masukkan nama  : ");
                                String nama1 = sc.nextLine();
                                System.out.print("Masukkan nilai : ");
                                int nilai1 = input.nextInt();
                                dll.addFirst(nama1, nilai1);
                                break;
                            case 2:
                                System.out.print("Masukkan nama : ");
                                String nama2 = sc.next();
                                System.out.print("Masukkan nilai : ");
                                int nilai2 = input.nextInt();
                                dll.addLast(nama2,nilai2);
                                break;
                            case 3: 
                                System.out.print("Masukkan index : ");
                                int index = input.nextInt();
                                System.out.print("Masukkan nama : ");
                                String nama3 = sc.next();
                                System.out.print("Masukkan nilai : ");
                                int nilai3 = input.nextInt();
                                dll.add(nama3, nilai3, index);
                            break;
                        }
                        break;
                    case 2:
                        hapusSubMenu();
                        subMenu = input.nextInt();
                        switch(subMenu) {
                            case 1:
                                dll.removeFirst();
                                break;
                            case 2:
                                dll.removeLast();
                                break;
                            case 3:
                                System.out.print("Masukkan index : ");
                                int index = input.nextInt();
                                dll.remove(index);
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("- List of Data -");
                        System.out.println("Nama\t  |\tNilai");
                        dll.print();
                        break;
                    case 4:
                        System.out.print("Masukkan data : ");
                        int data = input.nextInt();
                        System.out.println("Data ada pada index : " + dll.getByValue(data));
                        break;
                    case 5:
                        System.out.println("--- Data Awal ---");
                        dll.print();
                        System.out.println("-- Data Sorting --");
                        System.out.println("--  Descending -- ");
                        dll.bubblesort();
                        dll.print();
                        break;
                    case 6:
                        break;
                    default : 
                        System.out.println("Input yang anda masukkan salah.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
    
    private static void menu(){
        System.out.println("================================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cetak Data");
        System.out.println("4. Cari Data");
        System.out.println("5. Sorting Data");
        System.out.println("6. Exit");
        System.out.println("================================");
        System.out.print("Pilih Menu : ");
    }
    
    private static void tambahSubMenu(){
        System.out.println("Sub Menu");
        System.out.println("1. Tambah (First)");
        System.out.println("2. Tambah (Last)");
        System.out.println("3. Tambah (Index)");
        System.out.println("---------------------");
        System.out.print("Pilih Menu : ");
    }
    
    private static void hapusSubMenu(){
        System.out.println("Sub Menu");
        System.out.println("1. Hapus (First)");
        System.out.println("2. Hapus (Last)");
        System.out.println("3. Hapus (Index) ");
        System.out.println("---------------------");
        System.out.print("Pilih Menu : ");
    }
}
