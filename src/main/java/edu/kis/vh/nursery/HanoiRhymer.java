package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public final int reportRejected() {
        return totalRejected;
    }
<<<<<<< HEAD
        @Override
        public void push(int in) {
            if (!isEmpty() && in > peek())
                totalRejected++;
            else
                super.push(in);
        }
=======
    @Override
    public void push(int in) {
        if (!isEmpty() && in > peek())
            totalRejected++;
        else
            super.push(in);
    }
>>>>>>> 496a3217b39dad10205b10200d24838eeb783b5f
}
