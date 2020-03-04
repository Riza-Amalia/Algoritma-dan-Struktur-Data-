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
public class Fibonacci {
    //Algoritma Brute Force
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n; //0(1)
        System.out.println("Masukkan Fibonacci : "); //0(1)
        n = input.nextInt(); //0(1)
        
        int fib[] = new int[n]; //0(1)
        
        fib[0] =0; //0(1)
        fib[1] =1; //0(1)
        
        for(int i = 2;i<n; i++){ //0(n)
            fib[i] = fib[i-1] + fib[i-2]; //0(1)
        }
        for(int i=0; i<n; i++){ //0(n)
            System.out.println("Fibonacci ke-" +i+":" + fib[i]); //0(1)
            
            //Notasi  = 0(1+1+1+1+1+1+n*1+n+1)
            //        = 0(6+2n+1)
            //        = 0(7+2n)
            //        = 0(2n)
            //        = 0(n)
        }
    } 
}

