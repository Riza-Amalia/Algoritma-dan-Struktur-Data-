/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class NilaiAlgoritma {
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
       NilaiAlgoritma na = new NilaiAlgoritma(); 
       System.out.println("=======================================================");
       System.out.print("Masukkan Nama Mahasiswa : ");
       na.NamaMhs = input.next();
       
       System.out.print("Masukkan nilai Tugas : ");
       na.nilaiTugas = input.nextInt();
       System.out.print("Masukkan nilai Kuis : ");
       na.nilaiKuis = input.nextInt();
       System.out.print("Masukkan nilai UTS :");
       na.nilaiUTS = input.nextInt();
       System.out.print("Masukkan nilai UAS : ");
       na.nilaiUAS = input.nextInt();
       
       System.out.println("Nilai total : "+ na.hitungTotalNilai());    
   }
}