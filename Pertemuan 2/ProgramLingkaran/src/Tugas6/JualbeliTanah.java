/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class JualbeliTanah {
    public int panjang, lebar, jumlah;

    int hitungLuas() {
        return panjang * lebar;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        JualbeliTanah[] Luas = new JualbeliTanah[10];
        JualbeliTanah Luas2 = new JualbeliTanah();
        System.out.print("Jumlah Tanah: ");
        Luas2.jumlah = input.nextInt();
        for (int i = 0; i < Luas2.jumlah; i++) {
            Luas[i] = new JualbeliTanah();
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