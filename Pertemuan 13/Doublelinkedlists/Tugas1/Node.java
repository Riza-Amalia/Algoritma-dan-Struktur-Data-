package Tugas1;
/*
Nama : Riza Amalia Hariyanti
Kelas : TI 1F
Absen : 26
*/
public class Node<T> {
    
    T data;
    Node prev;
    Node<T> next;
    
    Node(Node prev, T data, Node<T> next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}


