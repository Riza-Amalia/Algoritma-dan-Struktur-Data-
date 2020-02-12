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
public class VariabelA {
    public static void mai(String[] args){
        Scanner input = new Scanner (System.in);
        int A;
        System.out.println("Masukkan nilai A :");
        A = input.nextInt();
         for (int i=0; i < 5; i++ ){
             A -= 3;
             System.out.println("A - 3 =" + A);
            } 
             if (A %2 == 0){
                 System.out.println("nilai adalah A ganjil");
             }
             else{
                 System.out.println("nilai adalah A genap");
             }
         }
    }