/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class waralaba {
    public String nama;
    public int nomeja,pilihan;
    public static int ChickenA = 12000,
            ChickenB = 15000,
            ChickenC = 20000,
            OkeA = 10000,
            OkeB = 12000,
            OkeC = 15000;
    
    public static void main(String[] args) throws IOException {
     Scanner in = new Scanner(System.in); 
        InputStreamReader st = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(st);
     waralaba w = new waralaba();

     
        System.out.println("----------------");
        System.out.println("----Waralaba----");
        System.out.println("----------------");
        System.out.println();
        
            
            System.out.println("Pilih menu paket : ");
            System.out.println("1. Paket Chicken : ");
            System.out.println("2. Paket Oke : ");
            
            System.out.println();
            System.out.print("Pilihan menu paket anda : ");
            w.pilihan = in.nextInt();
            
            switch (w.pilihan) {
                case 1:
                    
                    System.out.print("Nama Pembeli : ");
                    w.nomeja= in.nextInt();
                    
                    System.out.println();
                    System.out.println("Nama pembeli\t\t : " + w.nama);
                    System.out.println("Nomor meja               : "+ w.nomeja);
                    int total = ChickenC + ChickenA + ChickenB;
                    System.out.println("Harga total              : Rp. " + total);
                    System.out.println("------------------------------------");
                    break;
                case 2:
                    System.out.println("Nama Pembeli : ");
                    w.nama = br.readLine();
                    System.out.println("Nomor meja : ");
                    w.nomeja = in.nextInt();
                    System.out.println("Nama pembeli\t\t : " + w.nama);
                    System.out.println("Nomor meja               : " + w.nomeja);
                    int total1 = OkeA + OkeB + OkeC;
                    System.out.println("Harga total              : Rp. " + total1);
                    System.out.println("------------------------------------");
                    break; 
                    
                
            }
        }
    }
