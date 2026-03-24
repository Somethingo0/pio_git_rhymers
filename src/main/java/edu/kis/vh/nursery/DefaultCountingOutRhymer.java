package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY = -1;
    private static final int FULL_INDEX = CAPACITY - 1;
    private static final int RETURN_DEFAULT= -1;

    private final int[] numbers = new int[CAPACITY];

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_DEFAULT;
        return numbers[total--];
    }

}
