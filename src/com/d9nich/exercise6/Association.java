package com.d9nich.exercise6;

public class Association<E1, E2> {
    private final E1 first;
    private final E2 second;

    public Association(E1 first, E2 second) {
        this.first = first;
        this.second = second;
    }

    public E1 getFirst() {
        return first;
    }

    public E2 getSecond() {
        return second;
    }
}
