
package Tugas3;
/**
 *
 * @author Riza Amalia H
 */
public class ProgramBarangDiskon {

    public String nama;
    public int hargaSatuan,jumlah,diskon;
    
    int HargaTotal(){
        return hargaSatuan*jumlah;
    }
    int hitungDiskon(){
       if(HargaTotal()>100000){
        }else if(HargaTotal()>=50000&&HargaTotal()<=100000){
        }else if(HargaTotal()<50000){
        }
        return 0;
    }
    int hitungBayar(){
        return HargaTotal()-hitungDiskon();
    }   
}