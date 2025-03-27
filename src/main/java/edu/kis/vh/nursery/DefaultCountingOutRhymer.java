package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int INT1 = -1;
    public static final int INT2 = 11;
<<<<<<< HEAD
    private int[] NUMBERS = new int[INT];
=======
    private int[] numbers = new int[INT];
>>>>>>> 496a3217b39dad10205b10200d24838eeb783b5f

    public int total = INT1;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public final boolean isEmpty() {
        return total == INT1;
    }

    public final boolean isFull() {
        return total == INT2;
    }

    protected final int peek() {
        if (isEmpty())
            return INT1;
<<<<<<< HEAD
        return NUMBERS[total];
=======
        return numbers[total];
>>>>>>> 496a3217b39dad10205b10200d24838eeb783b5f
    }

    public int pop() {
        if (isEmpty())
            return INT1;
<<<<<<< HEAD
        return NUMBERS[total--];
=======
        return numbers[total--];
>>>>>>> 496a3217b39dad10205b10200d24838eeb783b5f
    }

}
