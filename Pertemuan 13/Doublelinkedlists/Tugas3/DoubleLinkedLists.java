package Tugas3;
/*
Nama : Riza Amalia Hariyanti
Kelas : TI 1F
Absen : 26
*/
public class DoubleLinkedLists<T> {
    
    Node head;
    int size;
    
    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(String nama, int item){
        if(isEmpty()){
            head = new Node(null, nama, item, null);
        } else {
            Node newNode = new Node(null, nama, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(String nama, int item){
        if(isEmpty()){
            addFirst(nama, item);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, nama, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(String nama, int item, int index) throws Exception {
        if(isEmpty()){
            addFirst(nama, item);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai index diluar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Node newNode = new Node(null, nama, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, nama, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.print(tmp.data1 + "\t\t" + tmp.data2);
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus !");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void remove(int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public int getFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        return(int) head.data2;
    }
    
    public int getLast() throws Exception {
        if(isEmpty()){
            throw new Exception ("Linked List kosong");
        }
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return (int) tmp.data2;
    }
    
    public int get (int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception ("Nilai indeks diluar batas");
        }
        Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return (int) tmp.data2;
    }
    
    public int getByValue(T value) throws Exception {
        boolean isExist = false;
        int index = 0;
        if (isEmpty() || size == 0) {
            throw new Exception("LinkedList kosong");
        } else {
            Node tmp = head;
            for (int i = 0; i < size; i++) {
                if (String.valueOf(tmp.data2).equals(String.valueOf(value))) {
                    isExist = true;
                    index = i;
                    break;
                }
                tmp = tmp.next;
            }
            if (isExist) {
                return index;
            } else {
                throw new Exception("Data " + value + " tidak ditemukan");
            }
        }
    }
    
    public void bubblesort(){
        int i;
        Node tmp;
        Node tmpNode = null;
        if(isEmpty()){
            System.out.println("Linked List Kosong");
        }
        do {
            i = 0;
            tmp = head;
            while (tmp.next != tmpNode){
                if ((int) tmp.data2 < (int) tmp.next.data2){
                    int x = (int) tmp.data2;
                    tmp.data2 = tmp.next.data2;
                    tmp.next.data2 = x;
                    String n = (String) tmp.data1;
                    tmp.data1 = tmp.next.data1;
                    tmp.next.data1 = n;
                    i = 1;
                }
                tmp = tmp.next;
            }
            tmpNode = tmp;
        } while (i != 0);
    }
}