package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    public static int getEMPTY() {
        return EMPTY;
    }
    /**
     * Dodaje element na koniec listy
     * @param i wartość elementu, który zostanie dodany na koniec listy
     */
    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }
    /**
     * Sprawdza czy lista jest pusta
     * @return true jeżeli lista jest pusta, w przeciwnym wypadku false
     */
    public boolean isEmpty() {
        return getLast() == null;
    }
    /**
     * Sprawdza, czy lista jest pełna
     * @return true jeżeli lista jest pełna, w przeciwnym wypadku false
     */
    public boolean isFull() {
        return false;
    }
    /**
     * Zwraca wartość elementu znajdującego się na końcu listy
     * @return wartość ostatniego elementu na liście
     */
    public int top() {
        if (isEmpty())
            return getEMPTY();
        return getLast().getValue();
    }
    /**
     * Usuwa ostatni element z listy
     * @return wartość usuwanego elementu listy
     */
    public int pop() {
        if (isEmpty())
            return getEMPTY();
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
