package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca stos zaimplementowany za pomocą listy dwukierunkowej.
 * Przechowuje elementy typu int.
 */
public class IntLinkedList {

    /**
     * Wartość zwracana, gdy operacja nie może zostać wykonana (np. stos pusty).
     */
    private static final int EMPTY_VALUE = -1;

    /**
     * Wskaźnik na ostatni (najnowszy) węzeł listy.
     */
    Node last;

    /**
     * Nieużywane pole, do usunięcia lub uzupełnienia.
     */
    int i;

    /**
     * Dodaje nowy element na szczyt stosu.
     *
     * @param i wartość do dodania
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true jeśli stos jest pusty, w przeciwnym razie false
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     * Dla tej implementacji zawsze zwraca false.
     *
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość z wierzchołka stosu bez usuwania jej.
     *
     * @return wartość z wierzchołka stosu lub {@link #EMPTY_VALUE} jeśli stos jest pusty
     */
    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return last.getValue();
    }

    /**
     * Usuwa i zwraca wartość z wierzchołka stosu.
     *
     * @return zdjęta wartość lub {@link #EMPTY_VALUE} jeśli stos jest pusty
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
