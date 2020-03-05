/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivideConquer;

/**
 *
 * @author Riza Amalia H
 */
public class Soal2 {
    private static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
    { 
     if (n == 1){ 
            System.out.println("Pindah 1 gelang dari tower " +  from_rod + " ke tower " + to_rod); 
            return; 
        } 
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        System.out.println("Pindah gelang " + n + " dari tower " +  from_rod + " ke tower " + to_rod); 
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
    }  
    public static void main(String args[]) 
    { 
        int n = 4; // Jumlah gelang
        towerOfHanoi(n, 'A', 'C', 'B'); // A,B dan C adalah nama tower
    } 
}