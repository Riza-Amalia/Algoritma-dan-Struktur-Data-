package Tugas1;
/**
 *
 * @author Riza Amalia Hariyanti
 */
public class Stack {
    
    int size;
    int top;
    String data[];
    
    public Stack(int size){
        this.size = size;
        data = new String[size];
        top = -1;
    }
    
    public boolean IsEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if(top == size -1){
            return true;
        } else {
            return false;
        }
    }
    
    public void push(String dt){
        if(!IsFull()){
            top++;
            data[top] = dt;
        } else {
            System.out.println("isi stack penuh!");
        }
    }
    
    public void pop(){
        if(!IsEmpty()){
            String x = data[top];
            top --;
            System.out.println("Data yang keluar : " + x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    //Untuk memeriksa elemen stack paling atas
    public void peek(){
        System.out.println("Elemen teratas : " + data[top]);
    }
    
    //Untuk menampilkan seluruh elemen pada stack
    public void print(){
        System.out.println("Isi stack : ");
        for(int i = top; i >= 0; i--){
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }
    
    //Untuk menghapus seluruh isi stack
    public void clear(){
        if(!IsEmpty()){
            for(int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
