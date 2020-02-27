/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Program Menghitung Keuntungan Total(Satuan Juta.Misal 5.9)");
        System.out.println("Masukkan jumlah bulan : ");
        int elm = input.nextInt();
        
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
