package Tugas1;
/*
Nama : Riza Amalia Hariyanti
Kelas : TI 1F
Absen : 26
*/
import java.util.Scanner;
public class DoubleLinkedListsMain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
                                System.out.print("Masukkan data : ");
                                dll.addFirst(input.nextInt());
                                break;
                            case 2:
                                System.out.print("Masukkan data : ");
                                dll.addLast(input.nextInt());
                                break;
                            case 3: 
                                System.out.print("Masukkan index : ");
                                int index = input.nextInt();
                                System.out.print("Masukkan data : ");
                                dll.add(input.nextInt(), index);
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
                        dll.print();
                        break;
                    case 4:
                        System.out.print("Masukkan data : ");
                        int data = input.nextInt();
                        System.out.println("Data ada pada index : " + dll.getByValue(data));
                        break;
                    case 5:
                        break;
                    default:
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
        System.out.println("5. Exit");
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
