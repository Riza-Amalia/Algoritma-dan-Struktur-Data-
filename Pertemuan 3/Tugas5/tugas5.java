/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;
import static Tugas5.Maintugas5.proses;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class tugas5 {
    static int n=4, c1=0, c2=0, c3=0;
    static int pilihan[] = new int[n];
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
       //   System.out.println("Masukkan Jumlah Pemilihan :");
      //    n = input.nextInt()
        
        System.out.println("Nama Calon Ketua \n1.Bima \n2.Arian \n3.Darman");
        for(int i=0; i<pilihan.length; i++){
            System.out.println("Masukkan Pilihan Pemilih ke-"+(i+1));
            pilihan[i] = input.nextInt();
        }
        proses(0);
        System.out.println("Ketua BEM tahun 2020 adalah ");
        if(c1 > c2 && c1 > c3){
            System.out.println("Bima");
        }else if(c2 > c1 && c2 > c3){
            System.out.println("Arlan");
        }else if(c3 > c1 && c3 > c2){
            System.out.println("Darman");
        }
    }
}
