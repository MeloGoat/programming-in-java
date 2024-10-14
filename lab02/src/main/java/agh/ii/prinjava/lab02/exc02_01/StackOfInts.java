package agh.ii.prinjava.lab02.exc02_01;

/**
 * Interface representing a stack of integers - Abstract Data Type (ADT).
 * This stack allows adding and removing integers following the LIFO (Last In, First Out) principle.
 */
public interface StackOfInts {

    /**
     * Removes and returns the integer at the top of the stack.
     *
     * @return the integer removed from the top of the stack
     * @throws IllegalStateException if the stack is empty
     */
    int pop();

    /**
     * Adds an integer to the top of the stack.
     *
     * @param x the integer to be added to the stack
     */
    void push(int x);

    /**
     * Checks if the stack is empty.
     *
     * @return {@code true} if the stack is empty, {@code false} otherwise
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return the number of elements in the stack
     */
    int numOfElems();

    /**
     * Returns the integer at the top of the stack without removing it.
     *
     * @return the integer at the top of the stack
     * @throws IllegalStateException if the stack is empty
     */
    int peek();
}
