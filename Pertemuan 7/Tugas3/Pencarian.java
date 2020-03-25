/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Riza Amalia H
 */
public class Pencarian {
     int maksimum=0;
    int jmlmaks=0;
    int index[] = new int[10];
    int i =0;
    
    public void pencarian(int data[]){
        for(int a=0;a<data.length;a++){
            if(data[a] >= maksimum){
                maksimum = data[a];
            }            
        }
        for(int a=0;a<data.length;a++){
            if(data[a] == maksimum){                    
                jmlmaks++;
                index[i] = a;
                i++;
            }
        }
    }
}