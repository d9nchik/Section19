package com.d9nich.exercise6;

public class Transition<E1, E2, E3> {
    private final E1 first;
    private final E2 second;
    private final E3 third;

    public Transition(E1 first, E2 second, E3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public E1 getFirst() {
        return first;
    }

    public E2 getSecond() {
        return second;
    }

    public E3 getThird() {
        return third;
    }
}
