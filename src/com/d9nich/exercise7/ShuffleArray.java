package com.d9nich.exercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ShuffleArray {
    public static <E> void shuffle(ArrayList<E> list){
        Random random = new Random();
        for (int i = 0; i < list.size()/2; i++) {
            int randomNumber = random.nextInt(list.size());
            E temp = list.get(i);
            list.set(i, list.get(randomNumber));
            list.set(randomNumber, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(i);
        shuffle(list);
        System.out.println(list);
    }
}
