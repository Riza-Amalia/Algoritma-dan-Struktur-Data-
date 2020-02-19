/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas8;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class ProgramModifikasiNo2 {
    public int panjang, lebar, jumlah, max = 0;

    int hitungLuas() {
        return panjang * lebar;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ProgramModifikasiNo2[] Luas = new ProgramModifikasiNo2[10];
        ProgramModifikasiNo2 Luas2 = new ProgramModifikasiNo2();
        System.out.print("Jumlah Tanah: ");
        Luas2.jumlah = input.nextInt();
        for (int i = 0; i < Luas2.jumlah; i++) {
            Luas[i] = new ProgramModifikasiNo2();
            System.out.println("Tanah " + (i + 1));
            System.out.println();
            System.out.print("Panjang: ");
            Luas[i].panjang = input.nextInt();
            System.out.print("Lebar: ");
            Luas[i].lebar = input.nextInt();
            System.out.println();
        }
        for (int i = 0; i < Luas2.jumlah; i++) {

            System.out.println("Luas Tanah " + (i + 1) + ": " + Luas[i].hitungLuas());
        }
    }
}