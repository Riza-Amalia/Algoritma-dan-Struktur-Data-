/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;
import java.util.Scanner;
/**
 *
 * @author Amelia
 */
public class graphArrayMain {
    public static void main(String args []){
        int v,e,count = 1, to = 0, from = 0;
        Scanner input = new Scanner(System.in);
        graphArray graph;
        try{
            System.out.println("Masukkan jumlah vertices : ");
            v = input.nextInt();
            System.out.println("Masukkan jumlah edges : ");
            e = input.nextInt();
            
            graph = new graphArray(v);
            
            System.out.println("Masukkan edges : <to> <from>");
            while (count <= e){
                to = input.nextInt();
                from = input.nextInt();
                
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagaian representasi graph sbb : ");
            System.out.print(" ");
            for(int i = 1; i <= v; i++){
                System.out.print(i + " ");
            }
            System.out.println();
            
            for(int i = 1; i <= v; i++){
                System.out.print(i + " ");
                for(int j = 1; j <= v; j++){
                    System.out.print(graph.getEdge(i,j) + " ");
                }
                System.out.println();
            }
        }catch (Exception E){
            System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
        }
        input.close();
    }
}
