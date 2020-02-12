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
public class Saldo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int saldo, i=2;
        double bunga;
        
        System.out.println("saldo bank selama 12 bulan dan mendapatkan bunga 2%");
        System.out.print("masukkan saldo : Rp ");
        saldo = input.nextInt();
        
        System.out.println("saldo bulan ke 1 : Rp" + saldo);
        while (saldo <= 12){
            bunga = saldo* 0.02;
            saldo += bunga;
        }
        System.out.println("Saldo bulan ke " + i + ": Rp" + saldo);
    }
}
