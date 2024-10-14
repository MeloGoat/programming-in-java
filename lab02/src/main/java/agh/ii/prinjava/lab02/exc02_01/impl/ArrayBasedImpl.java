package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Implementation of a stack data structure using a dynamic array of integers.
 * This class implements the StackOfInts interface, providing basic stack operations.
 */
public class ArrayBasedImpl implements StackOfInts {

    // Default initial capacity of the stack
    private static final int INITIAL_CAPACITY = 10;

    // Array to store stack elements
    private int[] elements;
    private int numOfElems; // Current number of elements in the stack

    /**
     * Constructor to initialize the stack with an initial capacity.
     */
    public ArrayBasedImpl() {
        elements = new int[INITIAL_CAPACITY];
        numOfElems = 0;
    }

    /**
     * Adds an element to the top of the stack.
     * If the stack is full, it doubles the size of the array.
     *
     * @param x the element to be added to the stack
     */
    @Override
    public void push(int x) {
        if (numOfElems == elements.length) {
            resize(elements.length * 2); // Double the size
        }
        elements[numOfElems++] = x; // Add element and increment count
    }

    /**
     * Removes and returns the top element of the stack.
     * If the stack is empty, an exception is thrown.
     *
     * @return the top element of the stack
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
        int element = elements[--numOfElems]; // Decrement count and retrieve element
        elements[numOfElems] = 0; // Optional: Clear the reference
        // Shrink the array if necessary
        if (numOfElems > 0 && numOfElems == elements.length / 4) {
            resize(elements.length / 2); // Halve the size
        }
        return element;
    }

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return the number of elements in the stack
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }

    /**
     * Returns the top element of the stack without removing it.
     * If the stack is empty, an exception is thrown.
     *
     * @return the top element of the stack
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek from an empty stack.");
        }
        return elements[numOfElems - 1]; // Return top element
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty; false otherwise
     */
    @Override
    public boolean isEmpty() {
        return numOfElems == 0;
    }

    /**
     * Resizes the internal array to the specified new capacity.
     *
     * @param newCapacity the new capacity for the internal array
     */
    private void resize(int newCapacity) {
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < numOfElems; i++) {
            newElements[i] = elements[i]; // Copy elements to new array
        }
        elements = newElements; // Update reference to the new array
    }
}

