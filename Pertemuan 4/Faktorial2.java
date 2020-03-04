/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfdc;

/**
 *
 * @author Riza Amalia H
 */
public class Faktorial2 {
    //Algoritma Divide Conquer
    public int faktorialDC(int n){
        if(n==1){ //0(1)
            return 1; //0(1)
        }
        else{
            int faktor = n*faktorialDC(n-1); //0(1)
            return faktor; //0(1)
            //Notasi = 0(1+1+1+1)
            //       = 0(4)
        }
    }
}
