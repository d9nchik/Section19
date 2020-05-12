package com.d9nich.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a string: ");
            stack.add(input.nextLine());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}
