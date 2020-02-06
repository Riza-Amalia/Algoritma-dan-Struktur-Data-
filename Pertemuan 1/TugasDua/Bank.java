/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasDua;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class Bank {
    public static void main(String[] args) {
      double uang = 1000000, bulan ,bunga = 0.02;
      for(bulan=0; uang <1500000; bulan++){
          uang += uang* bunga;
      }
        System.out.println("Bulan = " + bulan);
        System.out.println("Total = " + uang);
    }
}
