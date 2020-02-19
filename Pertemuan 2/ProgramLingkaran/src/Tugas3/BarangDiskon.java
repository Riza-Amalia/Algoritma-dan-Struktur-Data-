/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class BarangDiskon {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BarangDiskon br = new BarangDiskon();

		System.out.print("Masukkan Nama anda : ");
		br.nama = input.nextLine();
		System.out.print("Harga Barang : Rp. ");
		br.hargaSatuan = input.nextInt();
		System.out.print("jumlah barang : ");
		br.jumlah = input.nextInt();

		System.out.println("Nama\t\t\t = " + br.nama);
		System.out.println("Harga Satuan Barang\t = " + br.hargaSatuan);
		System.out.println("Harga Total \t\t = " + br.hitungHargaBayar());


	}
    private String nama;
    private int hargaSatuan;
    private int jumlah;

    private String hitungHargaBayar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}