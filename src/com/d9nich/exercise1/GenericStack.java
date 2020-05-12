package com.d9nich.exercise1;

import java.util.Arrays;

public class GenericStack<E> {
    private Object[] list = new Object[5];
    private int size = 0;

    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        return (E) list[getSize() - 1];
    }

    public void push(E o) {
        if (list.length == size)
            list = Arrays.copyOf(list, size * 2);
        list[size++] = o;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        return (E) list[size--];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "stack: " + Arrays.toString(list);
    }
}
