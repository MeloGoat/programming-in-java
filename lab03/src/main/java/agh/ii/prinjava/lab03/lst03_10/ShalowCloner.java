package agh.ii.prinjava.lab03.lst03_10;

import java.util.Arrays;

class ShalowCloner implements Cloneable {
    private int x = 10;
    private int[] ints = {1, 2, 3, 4, 5};

    public void setIntAtIdx(int idx, int val) {
        ints[idx] = val;
    }

    /**
     * Creates a shallow copy of the source object
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy (but "ints" is of a reference type!)
    }

    @Override
    public String toString() {
        return "ShalowCloner{" + "x=" + x + ", ints=" + Arrays.toString(ints) + '}';
    }
}
