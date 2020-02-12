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
public class Array2D {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            int arr[][] = new int[4][5];
            int jumlah = 0;
            
            System.out.println("input elemen array");
            System.out.println("=============================");
            
             for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Masukkan elemen ke-[" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
                jumlah += arr[i][j];
            }
            System.out.println("=============================");
        }
        System.out.println("Total jumlah arr = " + jumlah);
    }
}