/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class ProgramNilai {
    public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		ProgramNilai nl = new ProgramNilai();

		System.out.print("\nMasukkan jumlah mahasiswa : ");
		nl.jumlah = input.nextInt();

		ProgramNilai[] nilai = new ProgramNilai[nl.jumlah];

		for (int i = 0; i < nilai.length ; i++) {
			nilai[i] = new ProgramNilai();

			System.out.println("\nMahasiswa ke-" + (i+1) + " : ");
			System.out.print("Masukkan Nilai ke 1 : ");
			nilai[i].nilai1 = input.nextInt();
			System.out.print("Masukkan Nilai ke 2 : ");
			nilai[i].nilai2 = input.nextInt();
		}

		System.out.println();

		for (int i = 0; i < nilai.length ; i++) {
			System.out.println("Nilai Terbaik Mahasiswa ke-" + (i+1) + " : " + nl.max(nilai[i].nilai1 , nilai[i].nilai2));
		}
	}
    private int jumlah;
    private int nilai1;
    private int nilai2;

    private String max(int nilai1, int nilai2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}