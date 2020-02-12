/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class NilaiAkhir {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String nama;
       int nilai1, nilai2, nilai3;
       double m1, m2, m3, mm;
        System.out.println("Masukkan Nama Mahasiswa : ");
        nama = input.nextLine();
        
        System.out.println("Nilai Tugas : ");
        nilai1 = input.nextInt();
        
        System.out.println("Nilai UTS : ");
        nilai2 = input.nextInt();
        
        System.out.println("Nilai UAS : ");
        nilai3 = input.nextInt();
        
        m1 = 0.20 * nilai1;
        m2 = 0.35 * nilai2;
        m3 = 0.45 * nilai3;
        mm = m1 + m2 + m3;
        System.out.println("============================");
        System.out.println("Nilai murni yang di peroleh");
        System.out.println("Nilai murni Tugas : " +(int)m1);
        System.out.println("Nilai murni UTS   : " +(int)m2);
        System.out.println("Nilai murni UAS   : " +(int)m3);
        System.out.println("Nilai Akhir yang diperoleh yaitu : " +(int)mm);
    }    
}