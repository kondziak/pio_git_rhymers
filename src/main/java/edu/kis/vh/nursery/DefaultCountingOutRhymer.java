package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TOTALSTATUS = -1;
    public static final int SIZE = 12;
    public static final int RETURN_VALUE = -1;
    public static final int MAX = 11;
    public int total = TOTALSTATUS;
    private final int[] numbers = new int[SIZE];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == RETURN_VALUE;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total--];
    }

}
