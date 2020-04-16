package percobaan_5;
/**
 *
 * @author Riza Amalia H
 */
import java.util.Scanner;

public class MainLinkedList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList data = new LinkedList();

        do {
            try {
                menu();
                int menu = input.nextInt();
                int subMenu;
                switch (menu) {
                    case 1:
                        tambahSubMenu();
                        subMenu = input.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.print("Masukkan data: ");
                                data.addFirst(input.next());
                                break;
                            case 2:
                                System.out.print("Masukkan index: ");
                                int index = input.nextInt();
                                System.out.print("Masukkan data: ");
                                data.add(input.next(), index);
                                break;
                            case 3:
                                System.out.print("Masukkan data: ");
                                data.addLast(input.next());
                                break;
                        }
                        break;
                    case 2:
                        hapusSubMenu();
                        subMenu = input.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.print("Masukkan index: ");
                                int index = input.nextInt();
                                data.remove(index);
                                break;
                            case 2:
                                System.out.print("Masukkan key: ");
                                data.removeByValue(input.next());
                                break;
                            case 3:
                                data.clear();
                                break;
                        }
                        break;
                    case 3:
                        cariSubMenu();
                        subMenu = input.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.print("Masukkan index: ");
                                int index = input.nextInt();
                                System.out.println("Datanya adalah: " + data.get(index));
                                break;
                            case 2:
                                System.out.print("Masukkan key: ");
                                System.out.println("Datanya ada pada index: " + data.getByValue(input.next()));
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("- List Of Data -");
                        data.print();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    private static void menu() {
        System.out.println("Menu");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Tampil Data");
        System.out.println("5. Exit");
        System.out.println("----------------------");
        System.out.print("Pilih Menu: ");
    }

    private static void tambahSubMenu() {
        System.out.println("Sub Menu");
        System.out.println("1. Tambah (First)");
        System.out.println("2. Tambah (Index)");
        System.out.println("3. Tambah (Last)");
        System.out.println("----------------------");
        System.out.print("Pilih Menu: ");
    }

    private static void hapusSubMenu() {
        System.out.println("Sub Menu");
        System.out.println("1. Hapus (Index)");
        System.out.println("2. Hapus (Key)");
        System.out.println("3. Clear");
        System.out.println("----------------------");
        System.out.print("Pilih Menu: ");
    }

    private static void cariSubMenu() {
        System.out.println("Sub Menu");
        System.out.println("1. Cari (Index)");
        System.out.println("2. Cari (Key)");
        System.out.println("----------------------");
        System.out.print("Pilih Menu: ");
    }
}