/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author Riza Amalia H
 */
public class Tiket2 {
    Tiket2 ListTiket[] = new Tiket2[5];
    int idx;
    
    public void tambah(Tiket2 t){
        if(idx < ListTiket.length){
            ListTiket[idx] = t;
            idx++;
        } else{
            System.out.println("Data Sudah Penuh!");
        }
    }
    
    public void tampil(){
        for(Tiket2 t : ListTiket){
            t.tampil();
            System.out.println("------------------------------------------------------");
        }
    }
    
    public void bubbleSort(){
        for(int i=0; i<ListTiket.length-1; i++){
            for(int j=1; j<ListTiket.length-i; j++){
                if(ListTiket[j].harga < ListTiket[j-1].harga){
                    // di bawah ini proses swap atau penukaran
                    Tiket2 tmp = ListTiket[j];
                    ListTiket[j] = ListTiket[j-1];
                    ListTiket[j-1] = tmp;
                }
            }
        }
    }
    
    public void selectionSort(){
        for(int i=0; i<ListTiket.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<ListTiket.length; j++){
                if(ListTiket[j].harga < ListTiket[idxMin].harga){
                    idxMin = j;
                }
            }
            // swap
            Tiket2 tmp = ListTiket[idxMin];
            ListTiket[idxMin] = ListTiket[i];
            ListTiket[i] = tmp;
        }
    }
}