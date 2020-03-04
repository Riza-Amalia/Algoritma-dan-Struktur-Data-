/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfdc;
import java.util.Scanner;

/**
 *
 * @author Riza Amalia H
 */
public class BFDC {
    public int nilaiArray;
    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5]; // 0(1)
        Maxmin m = new Maxmin(); // 0(1)
        ppArray[0]= new minMax(); // 0(1)
        
        int min=ppArray[0].nilaiArray; // 0(1)
        int max=ppArray[0].nilaiArray; // 0(1)
        
        Scanner input = new Scanner(System.in); // 0(1)
        
        for(int i=0; i<5; i++){ // 0(n)
            ppArray[i] = new minMax(); // 0(1)
            System.out.println("Nilai array indeks ke-"+i); // 0(1)
            System.out.print("Masukkan nilai : "); // 0(1)
            ppArray[i].nilaiArray = input.nextInt(); // 0(1)
        }
        for(int i=0; i<5; i++){ //0(n)
            if(ppArray[i].nilaiArray<min) //0(1)
                min=ppArray[i].nilaiArray; //0(1)
            else if(ppArray[i].nilaiArray>max) //0(1)
                max=ppArray[i].nilaiArray; //0(1)
        }
        System.out.println("Brute Force"); //0(1)
        System.out.println("Nilai Minimal : " + min); //0(1)
        System.out.println("Nilai Maksimal : " + max); //0(1)
        
        int arr[] = new int[5]; // 0(1)
        for(int i=0; i<5; i++){ // 0(n)
            arr[i]=ppArray[i].nilaiArray; // 0(1)
        }
        Maxmin hasil = new Maxmin(); // 0(1)
        
        m.max_min(arr, 0, 4, hasil); // 0(1)
        
        System.out.println("Divide Conquer"); // 0(1)
        System.out.print("Nilai Minimal : " + hasil.minimum + "\nNilai Maksimaly : "+ hasil.maximum); // 0(1)
        System.out.print("\n"); // 0(1)
        //Notasi = 0(1+1+1+1+1+1+n*1*1*1*1+n*1*1*1*1+1+1+1+n*1+1+1+1+1+1)
        //       = 0(6+n+n+n+3+5)
        //       = 0(6+3n+8)
        //       = 0(14+3n)
        //       = 0(3n)
        //       = 0(n)
    }   
}
