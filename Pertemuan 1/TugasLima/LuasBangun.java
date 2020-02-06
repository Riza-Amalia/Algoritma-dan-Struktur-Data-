/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasLima;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class LuasBangun {
    public static void main(String[] args) {
         menu();

        
    }
    static void menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih bangun ruang : ");
            System.out.println("1. Luas Segitiga : ");
            System.out.println("2. Luas Segiempat : ");
            System.out.println("3. Luas Lingkaran : ");
            
            System.out.println();
            System.out.print("Pilihan luas : ");
            int luas = in.nextInt();
            
            switch (luas) {
                case 1:
                    LuasSegitiga();
                    break;
                case 2:
                    LuasSegiempat();
                    break; 
                case 3:
                    LuasLingkar();
                    
            }
    }
    static void LuasSegitiga(){
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan Alas : ");
        int alas=in.nextInt();
        System.out.println("Masukkan Tinggi : ");
        int tinggi=in.nextInt();
        double luas=alas*tinggi/2;
        System.out.println("Luas Segitiga Adalah "+luas);
    }
    static void LuasSegiempat(){
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan sisi : ");
        int sisi = in.nextInt();
        int luas = sisi*sisi;
        System.out.println("Luas Segiempat Adalah "+ luas);
    }
    static void LuasLingkar(){
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan jari2 : ");
        int jari2 = in.nextInt();
        double phi = 3.14;
        double luas= (3.14 * jari2 * jari2);
        System.out.println("Luas Lingkaran Adalah "+ luas);
    }
        
        
        
}

