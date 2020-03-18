/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class MainLigaInggris {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        TabelKelasemen data = new TabelKelasemen();
        LigaInggris Kelasemen[] = new LigaInggris[20];
        
        Kelasemen[0] = new LigaInggris("Manchester United", 29, 12, 42);
        Kelasemen[1] = new LigaInggris("Tottenham Hotspur", 29, 7, 41);
        Kelasemen[2] = new LigaInggris("Arsenal", 28, 4, 40);
        Kelasemen[3] = new LigaInggris("Burnley", 29, -6, 39);
        Kelasemen[4] = new LigaInggris("Crystal Palace", 29, -6, 39);
        Kelasemen[5] = new LigaInggris("Everton", 29, -6, 37);
        Kelasemen[6] = new LigaInggris("Liverpool", 29, 45, 82);
        Kelasemen[7] = new LigaInggris("Manchester City", 27, 39, 57);
        Kelasemen[8] = new LigaInggris("Leicester", 28, 26, 50);
        Kelasemen[9] = new LigaInggris("Newcastle United", 29, -16, 35);
        Kelasemen[10] = new LigaInggris("Southampton", 29, -17, 34);
        Kelasemen[11] = new LigaInggris("Brighton & Hove Albion", 29, -8, 29);
        Kelasemen[12] = new LigaInggris("Chelsea", 29, 9, 48);
        Kelasemen[13] = new LigaInggris("Wolverhampton Wanderers", 29, 7, 43);
        Kelasemen[14] = new LigaInggris("Sheffield United", 28, 5, 43);
        Kelasemen[15] = new LigaInggris("West Ham United", 29, -15, 27);
        Kelasemen[16] = new LigaInggris("Watford", 29, -17, 27);
        Kelasemen[17] = new LigaInggris("AFC Bournemouth", 29, -18, 27);
        Kelasemen[18] = new LigaInggris("Aston Villa", 27, -18, 25);
        Kelasemen[19] = new LigaInggris("Norwich City", 29, -27, 21);
        
        for (int i = 0; i < 20; i++) {
            data.tambah(Kelasemen[i]);
        }
        
        System.out.println("------------------------------------------------------");
        System.out.println("           Data Kelasemen Sebelum Di Sorting");
        System.out.println("------------------------------------------------------");
        data.tampil();
        
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("      Data Kelasemen Liga Inggris Pada Tahun 2020");
        System.out.println("            DI Insertion Sort (Ascending)");
        System.out.println("------------------------------------------------------");
        data.insertionSortAscending();
        data.tampil();
        
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("      Data Kelasemen Liga Inggris Pada Tahun 2020");
        System.out.println("            DI Insertion Sort (Descending)");
        System.out.println("------------------------------------------------------");
        data.insertionSortDescending();
        data.tampil();
    }
}