/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Riza Amalia H
 */
public class Searching {
       public int[] data;
    public int jumData;
    
    public Searching(int[] Data, int jmlData){
        this.jumData = jmlData;
        data = new int[jmlData];
        for(int i = 0; i < jumData; i++){
            data[i] = Data[i];
        }
    }

    Searching(int[][] data, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j = 0; j < jumData; j++){
            if (data[j] == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void Tampilposisi(int x, int pos){
        if (pos!= - 1){
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } 
        else {
            System.out.println("data : " + x + "tidak ditemukan.");
        }
    }

    void TampilData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}