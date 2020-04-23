/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Amelia
 */
public class Tahun2019<T> {
    T data;
    Tahun2019<T> next;
    
    public Tahun2019(T data, Tahun2019<T> next){
        this.data = data;
        this.next = next;
    }
}
