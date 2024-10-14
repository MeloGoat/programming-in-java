package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Linked list-based implementation of the {@link StackOfInts} interface.
 * This class provides basic operations for a stack of integers using a unidirectional linked list.
 */
public class LinkedListBasedImpl implements StackOfInts {

    /**
     * Removes and returns the integer at the top of the stack (front of the list).
     *
     * @return the integer removed from the front of the list
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public int pop() {
        if (first == null) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }

        // Save the value of the first node
        int poppedValue = first.elem;
        // Move the first pointer to the next node
        first = first.next;
        // Decrease the number of elements
        numOfElems--;

        return poppedValue;
    }

    /**
     * Adds an integer to the front of the list (top of the stack).
     *
     * @param x the integer to be added to the stack
     */
    @Override
    public void push(int x) {
        // Create a new node and make it the new first node
        Node newNode = new Node(x, first);
        // Set the new node as the first node in the list
        first = newNode;
        // Increment the number of elements
        numOfElems++;
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
     * Returns the integer at the top of the stack (front of the list) without removing it.
     *
     * @return the integer at the top of the stack
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public int peek() {
        if (first == null) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }

        return first.elem;
    }

    /**
     * A node in the linked list representing the stack elements.
     * Each node holds an integer value and a reference to the next node.
     */
    private static class Node {
        int elem;  // The value of the node
        Node next; // The reference to the next node

        /**
         * Constructs a new node with the given integer value and reference to the next node.
         *
         * @param elem the integer value for this node
         * @param next the reference to the next node in the list
         */
        public Node(int elem, Node next) {
            this.elem = elem;
            this.next = next;
        }
    }

    // The first node in the linked list (top of the stack)
    private Node first = null;

    // The number of elements currently in the stack
    private int numOfElems = 0;
}

