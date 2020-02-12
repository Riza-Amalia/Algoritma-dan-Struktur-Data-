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
public class Pseudocode {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int y;
        
        System.out.println("--- Program Mencari Bilangan Kelipatan ---");
        
        System.out.println("Masukkan suatu angka : ");
        y = input.nextInt();
        
        if (y % 2 == 0 && y % 6 != 0 && y % 15 != 0){
            System.out.println("Angka" + y + "adalah bilangan kelipatan 2");   
        }
        else if (y % 6 == 0 && y % 15 != 0){
            System.out.println("Angka" + y + " adalah bilangan kelipatan 6");  
        }
        else if(y % 15 == 0){
            System.out.println("Angka" + y + "adalah bilangan kelipatan 15");
        }
        else {
            System.out.println("Bilangan bukan kelipatan 2, 6,ataupun 15");
        }
    }
}