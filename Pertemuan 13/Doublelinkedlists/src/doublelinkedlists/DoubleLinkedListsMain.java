/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlists;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amelia
 */
public class DoubleLinkedListsMain {
    public static void main(String[] args){
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : " +dll.size());
        System.out.println("===============================");
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===============================");
        try {
            dll.add(40, 1);
        } catch (Exception ex) {
            Logger.getLogger(DoubleLinkedListsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        dll.print();System.out.println("Size : "+ dll.size());
        System.out.println("===============================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("===============================");
        
        /*
          Percobaan 2
        */
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("===============================");
        try {
            dll.removeFirst();
        } catch (Exception ex) {
            Logger.getLogger(DoubleLinkedListsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("===============================");
        try {
            dll.removeLast();
        } catch (Exception ex) {
            Logger.getLogger(DoubleLinkedListsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("===============================");
        try {
            dll.remove(1);
        } catch (Exception ex) {
            Logger.getLogger(DoubleLinkedListsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("===============================");
        
        /*
          Percobaan 2
        */
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("===============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("===============================");
        try {
            dll.add(40, 1);
        } catch (Exception ex) {
            Logger.getLogger(DoubleLinkedListsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("===============================");
        try {
            System.out.println("Data awal pada Linked Lists adalah : " + dll.getFirst());
        } catch (Exception ex) {
            Logger.getLogger(DoubleLinkedListsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("Data akhir Linked Lists adalah : " + dll.getLast());
        } catch (Exception ex) {
            Logger.getLogger(DoubleLinkedListsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("Data indeks ke-1 pada Linked Lists adalah : " + dll.get(1));
        } catch (Exception ex) {
            Logger.getLogger(DoubleLinkedListsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
