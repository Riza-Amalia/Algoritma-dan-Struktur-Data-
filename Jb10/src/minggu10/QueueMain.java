/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("------------------");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah maksimal antrian : ");
        int n = input.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        
        do{
            menu();
            pilih = input.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = input.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
