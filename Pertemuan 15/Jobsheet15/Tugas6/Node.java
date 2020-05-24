/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

/**
 *
 * @author Amelia
 */
public class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    Node(Node prev, T data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
