package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_CAPACITY = 12;
    private static final int INVALID_STACK_VALUE = -1;
    private static final int MAX = 11;
    private final int[] numbers = new int[MAX_CAPACITY];
    private static final int RETURN_EMPTY = -1;
    private int total = RETURN_EMPTY;


    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == RETURN_EMPTY;
    }


    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (callCheck())
            return INVALID_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INVALID_STACK_VALUE;
        return numbers[total--];
    }
}
