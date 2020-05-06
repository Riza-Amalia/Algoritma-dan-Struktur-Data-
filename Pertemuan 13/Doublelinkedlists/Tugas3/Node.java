package Tugas3;
/*
Nama : Riza Amalia Hariyanti
Kelas : TI 1F
Absen : 26
*/
public class Node<T> {
    
    T data1;
    T data2;
    Node prev;
    Node<T> next;
    
    Node(Node prev, T data1, T data2, Node<T> next){
        this.prev = prev;
        this.data1 = data1;
        this.data2 = data2;
        this.next = next;
    }
}


