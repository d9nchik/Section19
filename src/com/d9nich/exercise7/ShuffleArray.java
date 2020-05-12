package com.d9nich.exercise7;

import java.util.ArrayList;
import java.util.Random;

public class ShuffleArray {
    public static <E> void shuffle(ArrayList<E> list) {
        Random random = new Random();
        for (int i = 0; i < list.size() / 2; i++) {
            int randomNumber = random.nextInt(list.size());
            E temp = list.get(i);
            list.set(i, list.get(randomNumber));
            list.set(randomNumber, temp);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(random.nextInt());
        System.out.println(list);
        System.out.println(min(list));
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 1; i < list.size(); i++) {//Insert Sort
            E maximum = list.get(i);
            int position = i;
            while (position > 0 && maximum.compareTo(list.get(position - 1)) < 0) {
                list.set(position, list.get(position - 1));
                position--;
            }
            list.set(position, maximum);
        }
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0)
                min = list.get(i);
        }
        return min;
    }
}
