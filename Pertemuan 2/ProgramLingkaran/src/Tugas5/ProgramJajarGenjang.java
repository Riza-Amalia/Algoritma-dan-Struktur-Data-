/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class ProgramJajarGenjang {
    public int tinggi, sisi;
    public int panjang;

    int hitunLuas() {
        return panjang * tinggi;
    }

    int hitungKeliling() {
        return (2 * panjang) + (2 * sisi);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        ProgramJajarGenjang[] Cara = new ProgramJajarGenjang[5];

        for (int i = 0; i < Cara.length; i++) {
            Cara[i] = new ProgramJajarGenjang();
            System.out.print("Input Panjang Ke " + (i + 1) + " : ");
            Cara[i].panjang = input.nextInt();
            System.out.print("Input Tinggi: " + (i + 1) + " : ");
            Cara[i].tinggi = input.nextInt();
            System.out.print("Input Sisi Miring: " + (i + 1) + " : ");
            Cara[i].sisi = input.nextInt();
            System.out.println();
        
        }
        for (int i = 0; i < Cara.length; i++) {
            System.out.println("==========================================");
            System.out.println("Luas Jajar Genjang Ke " + (i + 1) + " Adalah : " + Cara[i].hitunLuas());
            System.out.println();
            System.out.println("Keliling Jajar Genjang Ke " + (i + 1) + " Adalah : " + Cara[i].hitungKeliling());
            System.out.println("==========================================");
            System.out.println();
        }
    }
}