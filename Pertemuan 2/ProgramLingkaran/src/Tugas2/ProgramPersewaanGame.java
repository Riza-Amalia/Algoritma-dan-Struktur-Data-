/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class ProgramPersewaanGame {
    public int id, waktu, hargaSewa = 7000, namaGame;
    public String nama;

    int hargaPinjam() {
        return waktu * hargaSewa;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ProgramPersewaanGame peminjaman = new ProgramPersewaanGame();
        do {
            System.out.println("====Selamat Datang Di Menu====");
            System.out.println("=======Peminjaman Game=======");
            System.out.println("1.Game Monster Hunter");
            System.out.println("2.Game The Sims 3");
            System.out.println("3.Game Good of War ");
            System.out.println("4.EXIT");
            System.out.print("Pilih Game Yg diinginkan: ");
            peminjaman.namaGame = input.nextInt();
            switch (peminjaman.namaGame) {
                case 1:
                    System.out.println("Pilihan Game anda Monster Hunter");
                    System.out.print("Input ID member Anda: ");
                    peminjaman.id = input.nextInt();
                    System.out.print("Input Nama Anda: ");
                    peminjaman.nama = input.next();
                    System.out.print("Input Waktu Meminjam: ");
                    peminjaman.waktu = input.nextInt();
                    System.out.println();
                    System.out.println("========================");
                    System.out.println("Nama Anda    : " + peminjaman.nama);
                    System.out.println("ID Anda         : " + peminjaman.id);
                    System.out.println("pilihan Game  : Monster Hunter");
                    System.out.println("Waktu Pinjam : " + peminjaman.waktu);
                    System.out.println("Harga            : " + peminjaman.hargaSewa);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Pilihan Game anda The Sims 3");
                    System.out.print("Input ID member Anda: ");
                    peminjaman.id = input.nextInt();
                    System.out.print("Input Nama Anda: ");
                    peminjaman.nama = input.next();
                    System.out.print("Input Waktu Meminjam: ");
                    peminjaman.waktu = input.nextInt();
                    System.out.println("========================");
                    System.out.println("Nama Anda    : " + peminjaman.nama);
                    System.out.println("ID Anda         : " + peminjaman.id);
                    System.out.println("pilihan Game  : The Sims 3");
                    System.out.println("Waktu Pinjam : " + peminjaman.waktu);
                    System.out.println("Harga            : " + peminjaman.hargaSewa);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Pilihan Game anda Good of War");
                    System.out.print("Input ID member Anda: ");
                    peminjaman.id = input.nextInt();
                    System.out.print("Input Nama Anda: ");
                    peminjaman.nama = input.next();
                    System.out.print("Input Waktu Meminjam: ");
                    peminjaman.waktu = input.nextInt();
                    System.out.println("========================");
                    System.out.println("Nama Anda    : " + peminjaman.nama);
                    System.out.println("ID Anda         : " + peminjaman.id);
                    System.out.println("pilihan Game  : Good of War");
                    System.out.println("Waktu Pinjam : " + peminjaman.waktu);
                    System.out.println("Harga            : " + peminjaman.hargaSewa);
                    System.out.println();
                    break;
                default:
                    System.out.println("==TERIMA KASIH==");
                    break;
            }
        } while (peminjaman.namaGame > 0 && peminjaman.namaGame < 3);
    }
}