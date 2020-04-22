package Tugas2;
/**
 *
 * @author Riza Amalia H 
 */
    public class nodeProyek<T> {
     String data1;
     String data2;
     String data3;
     String data4;
     nodeProyek next;
    
    public nodeProyek (String nip,String nama,String jabatan,String salary,nodeProyek next) {
        data1 = nip;
        data2 = nama;
        data3 = jabatan;
        data4 = salary;
        this.next=next;        
    }    
   
}
