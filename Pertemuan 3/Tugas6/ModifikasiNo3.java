/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class ModifikasiNo3 {
     public String namaMhs[];
    public int jmlh;
    public double rata[];
    public double nilai;

    public ModifikasiNo3(int jmlh) {
        this.namaMhs = new String[jmlh];
        this.nilai= 0;
        this.rata = new double [jmlh];
        this.jmlh=jmlh;
    }
    double rataDC(double arr[], int a, int b){
        if(a==b){
            return arr[1];
        }
        else if(a<b){
            int nilai= (a+b)/2;
            double anilai=rataDC(arr, a, nilai-1);
            double bnilai = rataDC(arr, nilai+1, b);
            return bnilai+anilai + arr[nilai];
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner angka= new Scanner(System.in);
        Scanner huruf = new Scanner(System.in);
        
        System.out.println("===== PROGRAM PERHITUNGAN RATA-RATA DC=======");
        System.out.print("masukkan jumlah mahasiswa : ");
        int n= angka.nextInt();
        
        ModifikasiNo3 arr= new ModifikasiNo3(n);
        System.out.println();
        for(int i=0;i<n; i++){
            System.out.print("Masukkan nama mahasiswa " + (i+1) + " : ");
            arr.namaMhs[i]=huruf.nextLine();
            System.out.print("Masukkan nilai : ");
            arr.rata[i] = angka.nextInt();
            System.out.println();
        }
        for(int i=0; i<arr.jmlh;i++){
            System.out.println("nilai " + arr.namaMhs[i]+" : "+ arr.rata[i]);
        }
        System.out.println();
        System.out.println("rata-rata nilai mahasiswa : "+ String.format("%.2f", arr.rataDC(arr.rata, 0, arr.jmlh)));
    }   
}