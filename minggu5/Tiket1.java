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
public class Tiket1 {
    String Maskapai;
    float harga;
    int transitCount, flightTime;
    
    
    Tiket1(String m, float h, int t, int f){
        Maskapai = m;
        harga = h;
        transitCount = t;
        flightTime = f;
    }
    void tampil(){
        System.out.println("Maskopai= "+ Maskapai);
        System.out.println("harga= "+ harga);
        System.out.println("transitCount= "+ transitCount);
        System.out.println("flightTime= "+ flightTime);
    }
    
}