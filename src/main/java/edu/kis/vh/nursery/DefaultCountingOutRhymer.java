package edu.kis.vh.nursery;

/**
 * Klasa bazowa wyliczanki.
 */
public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY = -1;
    private static final int FULL_INDEX = CAPACITY - 1;
    private static final int RETURN_DEFAULT= -1;

    private final int[] numbers = new int[CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY;
    /**
     * Dodaje element do wyliczanki.
     * * @param in wartość, która zostanie dodana do stosu wyliczanki
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * Sprawdza, czy wyliczanka jest pusta.
     * * @return true jeśli jest pusta, false w przeciwnym razie
     */
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

    /**
     * Zwraca i usuwa ostatni element z wyliczanki.
     * * @return wartość ostatniego elementu lub -1 (RETURN_DEFAULT), gdy wyliczanka jest pusta
     */
    public int countOut() {
        if (callCheck())
            return RETURN_DEFAULT;
        return numbers[total--];
    }

}
