package percobaan_3_4;
/**
 *
 * @author Riza Amalia H
 */
public class Node<T> {

    T data;
    Node<T> next;
    
    public Node (T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
}
