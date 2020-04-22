package Tugas1;
/**
 *
 * @author Riza Amalia H 
 */
import java.util.Scanner;

public class mahasiswaLinkedList {
    
    private nodeMahasiswa head;
    private nodeMahasiswa tail;
    int size;
   
    public mahasiswaLinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim,String nama,String alamat) {
        head = new nodeMahasiswa(nim,nama,alamat,head);
        size++;
    }

    public void add(String nim,String nama,String alamat,int index) throws Exception {
        if(index <0 || index> size) {
            throw new Exception ("Nilai Index Di Luar Batas");
        }
        else{
        if(isEmpty() || index==0) {
            addFirst(nim,nama,alamat);
        }
        else{
            nodeMahasiswa tmp = head;
            for(int i=1; i<index; i++) {
                tmp = tmp.next;
            }
            nodeMahasiswa next = (tmp ==null) ? null : tmp.next;
            tmp.next = new nodeMahasiswa (nim,nama,alamat,next);
        }
        size++;
        }
    }

    public void addLast(String nim,String nama,String alamat) {
        if(isEmpty()) {
            addFirst(nim,nama,alamat);
        }
        else{
            nodeMahasiswa tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new nodeMahasiswa (nim,nama,alamat,null);
        }
        size++;
        
    }

    public Object getFirst () throws Exception {
        if(isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        return(head.data1+head.data2+head.data3);
    }

    public Object getLast() throws Exception {
        if (isEmpty ()) {
            throw new Exception("LinkedList Kosong");
        }
        nodeMahasiswa tmp = head;
        while (tmp.next!=null) {
            tmp=tmp.next;
        }
        return  (tmp.data1+tmp.data2+tmp.data3);
        
    }

    public Object get(int index) throws Exception {
        if(isEmpty() || index>= size) {
            throw new Exception("Nilai Index Di Luar Batas");
        }
        nodeMahasiswa tmp = head;
        for  (int i=0; i<index; i++) {
            tmp = tmp.next;
        }
        return (tmp.data1+tmp.data2+tmp.data3);
    }

    public void remove(int index) throws Exception {
        if (isEmpty () || index >= size) {
            throw new Exception ("Nilai Index Di Luar Batas");
        } 
        else{  
        nodeMahasiswa prev = head;
        nodeMahasiswa cur = head.next;
        for (int i=1; i<index; i++) {
            prev = cur;
            cur = prev.next;
        }
        prev.next = cur.next;
        size--;
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
        
    }

    public void clear () {
        head=null;
        size=0;
    }

    public void print () {
        if (!isEmpty()) {
            nodeMahasiswa tmp = head;
            System.out.println("=====================");
            System.out.println("Daftar Nama Mahasiswa");
            System.out.println("=====================");
        while (tmp !=null) {
            System.out.println();
            System.out.println("NIM\t: " + tmp.data1);
            System.out.println("Nama\t: "+ tmp.data2);
            System.out.println("Alamat\t: "+ tmp.data3);
            System.out.println("====================");
            tmp = tmp.next;
        }
            System.out.println();
        }
        else{
            System.out.println("LinkedList Kosong");
        }
    }

    public void addByValue(String  cari, String nim,String nama,int index) throws Exception {
            nodeMahasiswa tmp = head;
            boolean ditemukan = false;
            while (tmp.next != null) {
                tmp = tmp.next;
                index++;
                if (head.data2 == cari) {
                    ditemukan = true;
                    break;
                } else if (tmp.data2 == cari) {
                    ditemukan = true;
                    index++;
                    break;
                }
            }
            if (ditemukan) {
                add(nama, nim,cari,index);
            } else {
                throw new Exception("Data tidak ditemukan!");
            }
        }

    public void RemoveByValue(String nim) throws Exception {

        if(isEmpty()) {
            System.out.println("LinkedList Kosong");
        }
        else{
            nodeMahasiswa tmp = head;
            while(tmp.next!=null) {
                if(tmp.data1.equalsIgnoreCase(nim)) {
                    break;
                }
                int n=0;
                n++;
                tmp= tmp.next;
            }
            int n=0;
            if(n==0) {
                removeFirst();
            }
            else{
                nodeMahasiswa prev = head;
                nodeMahasiswa cur = head.next;
                
                for(int i=1; i<n; i++) {
                    prev = cur;
                    cur = prev.next;
                }
                prev.next = cur.next;
                size--;
            }
        }
    }

    public void cariIndex (int index) throws Exception {
    if (index < 0 || index > size) {
                throw new Exception("Nilai index diluar batas");
            } else {
                nodeMahasiswa tmp = head;
                for (int i = 1; i < index; i++) {
                    tmp = tmp.next;
                }
                System.out.println("Data pada indeks ke-" + index + " adalah : " + tmp.data1);
            }
    }

    
    public void cariKey (String cari) throws Exception {
        nodeMahasiswa tmp = head;
            int index = 0;
            boolean ditemukan = false;
            if (isEmpty()) {
                System.out.println("LinkedLists kosong");
            } else {
                while (tmp.next != null) {
                    tmp = tmp.next;
                    index++;
                    if (head.data1 == null ? cari == null : head.data1.equals(cari)) {
                        ditemukan = true;
                        break;
                        
                    } else if (tmp.data1 == null ? cari == null : tmp.data1.equals(cari)) {
                        ditemukan = true;
                        index++;
                        break;
                    }
                    
                    
                }
            }
            if (ditemukan) {
                System.out.println("Data " + cari + " ditemukan pada indeks ke-" + (index-1));
            } else {
                throw new Exception("Data tidak ditemukan!");
            }
    }
}
