/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class tugas2 {
    public String NamaMhs;
   public int nilaiTugas;
   public int nilaiKuis;
   public int nilaiUTS;
   public int nilaiUAS;
   
   public double hitungTotalNilai(){
   return ((nilaiTugas * 0.3) +(nilaiKuis * 0.2)+(nilaiUTS * 0.2)+(nilaiUAS * 0.3));
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan jumlah Mahasiswa : ");
       int jml = input.nextInt();
       tugas2[] tg = new tugas2[jml]; 
       for (int i = 0; i < jml; i++) {
           tg[i] = new tugas2();
        System.out.println("=======================================================");
        System.out.print("Masukkan Nama Mahasiswa : ");
       tg[i].NamaMhs = input.next();
       System.out.print("Masukkan nilai Tugas : ");
       tg[i].nilaiTugas = input.nextInt();
       System.out.print("Masukkan nilai Kuis : ");
       tg[i].nilaiKuis = input.nextInt();
       System.out.print("Masukkan nilai UTS :");
       tg[i].nilaiUTS = input.nextInt();
       System.out.print("Masukkan nilai UAS : ");
       tg[i].nilaiUAS = input.nextInt();
       
       System.out.println("Nilai total : "+ tg[i].hitungTotalNilai());  
      
       }
      
   }
}