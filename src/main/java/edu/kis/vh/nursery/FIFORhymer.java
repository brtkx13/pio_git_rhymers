package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public int pop() {
        while (!isEmpty())
            temp.countIn(super.pop());

        int ret = temp.pop();

        while (!temp.isEmpty())
            countIn(temp.pop());

        return ret;
    }
}
