package com.d9nich.exercise5;

public class Triplet<E> {
    private final E first;
    private final E second;
    private final E third;

    public Triplet(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E getThird() {
        return third;
    }
}
