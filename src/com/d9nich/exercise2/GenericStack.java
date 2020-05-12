package com.d9nich.exercise2;

import java.util.ArrayList;

public class GenericStack<T> extends ArrayList<T> {
    public int getSize() {
        return size();
    }

    public T peek() {
        return get(getSize() - 1);
    }

    public void push(T o) {
        add(o);
    }

    public T pop() {
        T o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
