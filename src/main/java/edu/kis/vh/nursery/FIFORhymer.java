package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

    @Override
    public int pop() {
        while (!isEmpty())
            temp.push(super.pop());

        int ret = temp.pop();

        while (!temp.isEmpty())
            push(temp.pop());

        return ret;
    }
}
