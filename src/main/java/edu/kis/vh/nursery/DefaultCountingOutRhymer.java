package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int INITIAL = -1;
    public static final int MAX = 11;
    private final int[] numbers = new int[CAPACITY];
    public static final int RETURN = -1;
    public int total = INITIAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == RETURN;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peek() {
        if (isEmpty())
            return INITIAL;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return INITIAL;
        return numbers[total--];
    }

}
