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
public class SearchingMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[][] data = {{45, 78, 7,200, 80}, {90, 1, 17, 100, 50}, {21, 2, 40, 18, 6,5}};
        Searching pencarian = new Searching(data, 3, 5);
        System.out.println("Pencarian Data Array 2D Menggunakan Sequential Search");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Masukkan data yang dicari : ");
        int cari = input.nextInt();
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
    }
}