/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTiga;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class TugasTiga {
    public static void main(String[] args) {

char[] x = {'M', 'I', 'S', 'S', 'I', 'S', 'S', 'I', 'P', 'I'};	   
int M = 0;
int I = 0;
int S = 0;
int P = 0;
for (int i = 0; i < x.length; i++) {	      
    if (x [i] == 'M') M++;
}	   
System.out.println("Jumlah M Adalah : "+ M);

for (int j = 0; j < x.length; j++) {	      
    if (x [j] == 'i') I++;
}	   
System.out.println("Jumlah I Adalah : "+ I);

for (int k = 0; k < x.length; k++) {	      
    if (x [k] == 'S') S++;
}	   
System.out.println("Jumlah S Adalah : "+ S);

for (int l = 0; l < x.length; l++) {	      
    if (x [l] == 'P') P++;
}	   
System.out.println("Jumlah P Adalah : "+ P);
    }  
}

        
    

