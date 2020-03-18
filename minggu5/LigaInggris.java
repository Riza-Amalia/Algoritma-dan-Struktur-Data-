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
public class LigaInggris {
    public String namaClub;
    public int poin,pertandingan,gol;
    
    public LigaInggris(){
    }
    public LigaInggris(String nC, int pn, int pt,int gl){
        namaClub = nC;
        poin = pn;
        pertandingan = pt;
        gol = gl;
    }
    public void tampil(){
        System.out.println("--------------Premier League--------------");
        System.out.println("Nama Club Liga Inggris : "+ namaClub);
        System.out.println("Jumlah Pertandingan : "+ pertandingan);
        System.out.println("Gol Difference : "+ gol);
        System.out.println("Poin Pertandingan :"+ poin);
    }
}
