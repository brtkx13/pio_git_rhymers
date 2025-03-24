package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void push(int in) {
        if (!isEmpty() && in > peek())
            totalRejected++;
        else
            super.push(in);
    }
}
