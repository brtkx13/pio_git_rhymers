package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public final int reportRejected() {
        return totalRejected;
    }

        @Override
        public void push(int in) {
            if (!isEmpty() && in > peek())
                totalRejected++;
            else
                super.push(in);
        }
}
