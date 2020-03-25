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
public class MainSorting {   
  
    public static void main(String[] args) {
        int data[] = {12,17,2,1,70,50,90,17,90,90};
        
        System.out.println("          - Program Searching Data -        ");
        System.out.println("Data awal :");
        for (int x = 0; x < data.length; x++){
            System.out.print(data[x]+" ");
        }
        
        for (int i=0; i<data.length; i++){
            for (int j=0; j<data.length; j++){
                if (data[i]<data[j]){
                    int hasil=data[i];
                    data[i]=data[j];
                    data[j]=hasil;
                }
            }
        }
        System.out.println("");
        
        System.out.println("Data setelah diurutkan :");
        for (int x = 0; x < data.length; x++){
            System.out.print(data[x]+" ");
        }
        
        Pencarian tgs = new Pencarian();
        tgs.pencarian(data);
        
        System.out.println("");
        System.out.println("============================================");
        System.out.print("Data maksimum           : "+ tgs.maksimum+"\n");
        System.out.print("Banyak data maksimum    : "+ tgs.jmlmaks+"\n");
        System.out.print("Letak data maksimum pada index : ");
        for(int i=0;i<tgs.i;i++){
            System.out.print(tgs.index[i]+",");
        }
        System.out.println("");
        System.out.println("============================================");
    }
}