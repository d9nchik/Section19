package com.d9nich.exercise3;

public class Pair<E> {
    private final E pair1;
    private final E pair2;

    public Pair(E pair1, E pair2) {
        this.pair1 = pair1;
        this.pair2 = pair2;
    }

    public E getPair1() {
        return pair1;
    }

    public E getPair2() {
        return pair2;
    }
}
