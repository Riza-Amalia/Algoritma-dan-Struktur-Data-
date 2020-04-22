package Tugas2;
/**
 *
 * @author Riza Amalia H 
 */
import javax.sound.sampled.SourceDataLine;

public class proyekLinkedList {
    
    private nodeProyek head;
    private nodeProyek tail;
    int size;
   
    public proyekLinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nip,String nama,String jabatan, String salary) {
        head = new nodeProyek(nip,nama,jabatan,salary,head);
        size++;
    }

    public void add(String nip,String nama,String jabatan,String salary,int index) throws Exception {
        if(index <0 || index> size) {
            throw new Exception ("Nilai Index Di Luar Batas");
        }
        else{
        if(isEmpty() || index==0) {
            addFirst(nip,nama,jabatan,salary);
        }
        else{
            nodeProyek tmp = head;
            for(int i=1; i<index; i++) {
                tmp = tmp.next;
            }
            nodeProyek next = (tmp ==null) ? null : tmp.next;
            tmp.next = new nodeProyek (nip,nama,jabatan,salary,next);
        }
        size++;
        }
    }

    public void addLast(String nip,String nama,String jabatan,String salary) {
        if(isEmpty()) {
            addFirst(nip,nama,jabatan,salary);
        }
        else{
            nodeProyek tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new nodeProyek (nip,nama,jabatan,salary,null);
        }
        size++;
        
    }

    public Object getFirst () throws Exception {
        if(isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        return(head.data1+head.data2+head.data3+head.data4);
    }

    public Object getLast() throws Exception {
        if (isEmpty ()) {
            throw new Exception("LinkedList Kosong");
        }
        nodeProyek tmp = head;
        while (tmp.next!=null) {
            tmp=tmp.next;
        }
        return  (tmp.data1+tmp.data2+tmp.data3+tmp.data4);
        
    }

    public Object get(int index) throws Exception {
        if(isEmpty() || index>= size) {
            throw new Exception("Nilai Index Di Luar Batas");
        }
        nodeProyek tmp = head;
        for  (int i=0; i<index; i++) {
            tmp = tmp.next;
        }
        return (tmp.data1+tmp.data2+tmp.data3+tmp.data4);
    }

    public void remove(int index) throws Exception {
        if (isEmpty () || index >= size) {
            throw new Exception ("Nilai Index Di Luar Batas");
        } 
        else{  
        nodeProyek prev = head;
        nodeProyek cur = head.next;
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
            nodeProyek tmp = head;
            System.out.println("=====================");
            System.out.println(" Daftar Nama Pekerja ");
            System.out.println("=====================");
        while (tmp !=null) {
            System.out.println();
            System.out.println("Nip\t: " + tmp.data1);
            System.out.println("Nama\t: "+ tmp.data2);
            System.out.println("Jabatan\t: "+ tmp.data3);
            System.out.println("Salary\t: "+ tmp.data4);
            System.out.println("====================");
            tmp = tmp.next;
        }
            System.out.println();
        }
        else{
            System.out.println("LinkedList Kosong");
        }
    }

    public void addByValue(String  cari, String nip,String nama,int index) throws Exception {
            nodeProyek tmp = head;
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
                add(nama, nip,cari, nama, index);
            } else {
                throw new Exception("Data tidak ditemukan!");
            }
        }

    public void RemoveByValue(String nip) throws Exception {

        if(isEmpty()) {
            System.out.println("LinkedList Kosong");
        }
        else{
            nodeProyek tmp = head;
            while(tmp.next!=null) {
                if(tmp.data1.equalsIgnoreCase(nip)) {
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
                nodeProyek prev = head;
                nodeProyek cur = head.next;
                
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
                nodeProyek tmp = head;
                for (int i = 1; i < index; i++) {
                    tmp = tmp.next;
                }
                System.out.println("Data pada indeks ke-" + index + " adalah : " + tmp.data1);
            }
    }

    
    public void cariKey (String cari) throws Exception {
        nodeProyek tmp = head;
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
