/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;
import java.util.Scanner;
/**
 *
 * @author Riza Amalia H
 */
public class ProgramPacMan {
    static Scanner input = new Scanner(System.in);
		
	public static void setting(){
		System.out.println("Game PacMan : ");
		System.out.println("w = bergerak ke atas");
		System.out.println("s = bergerak ke bawah");
		System.out.println("a = bergerak ke kiri");
		System.out.println("d = bergerak ke kanan");
		
	}

	public static void warning(){
		System.out.println("\n\nMasukkan input yang tepat !!!\n\n");
		input();

	}

	public static void over(){
		System.out.println("\n\nKoordinat tidak boleh kurang dari 0 !!!\n\n");
		input();
	}

	public static void input(){
		PacMan sc = new PacMan();
		sc.width = 5;
		sc.height = 5;

		setting();
		System.out.print("\nMasukkan kontrol : ");
		sc.select = input.nextLine() .toLowerCase();

		switch (sc.select) {
			case "w": 
						if ((sc.y-1) < 0) {
							over();
						}
			break;
			case "s":
						if ((sc.y + 1) >= sc.width) {
							over();
						}
						
			break;
			case "a":	
						if ((sc.x-1) < 0) {
							over();
						}
			break;
			case "d":
						if ((sc.x + 1) >= sc.height) {
							over();
						}						
			break;
			default:
		}

		switch(sc.select){
			case "w" : sc.moveUp();
			break;
			case "s" : sc.moveDown();
			break;
			case "a" : sc.moveLeft();
			break;
			case "d" : sc.moveRight();
			break;
			default: warning();
		}

		sc.printPosition();
		System.out.println("Titik Koordinat adalah (" + sc.x + " , " + sc.y + ")");
		input();
	}

	public static void main(String[]args){
		input();
	}
}