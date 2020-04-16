package percobaan_5;
/**
 *
 * @author Riza Amalia H
 */
public class LinkedList<T> {
    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T item) {
        head = new Node(item, head);
        size++;
    }

    public void add(T item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas");
        }
        if (isEmpty() || size == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
            size++;
        }
    }

    public void addByValue(T item, T value) throws Exception {
        boolean isExist = false;
        int index = 0;
        if (isEmpty() || size == 0) {
            throw new Exception("LinkedList kosong");
        } else {
            Node tmp = head;
            for (int i = 0; i < size; i++) {
                if (tmp.data == value) {
                    isExist = true;
                    index = i + 1;
                    break;
                }
                tmp = tmp.next;
            }
            if (isExist) {
                add(item, index);
            } else {
                throw new Exception("Data " + value + " tidak ditemukan");
            }
        }
    }

    public void addLast(T item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
            size++;
        }
    }

    public Object getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }

    public Object getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getByValue(T value) throws Exception {
        boolean isExist = false;
        int index = 0;
        if (isEmpty() || size == 0) {
            throw new Exception("LinkedList kosong");
        } else {
            Node tmp = head;
            for (int i = 0; i < size; i++) {
                if (String.valueOf(tmp.data).equals(String.valueOf(value))) {
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

    public Object get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeByValue(T value) throws Exception {
        boolean isExist = false;
        int index = 0;
        if (isEmpty() || size == 0) {
            throw new Exception("LinkedList kosong");
        } else {
            Node tmp = head;
            for (int i = 0; i < size; i++) {
                if (tmp.data == value) {
                    isExist = true;
                    index = i;
                    break;
                }
                tmp = tmp.next;
            }
            if (isExist) {
                remove(index);
            } else {
                throw new Exception("Data " + value + " tidak ditemukan");
            }
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedList kosong");
        }
    }

}